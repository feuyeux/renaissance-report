package org.feuyeux.benchmark.renaissance.parse;

import lombok.extern.slf4j.Slf4j;
import org.feuyeux.benchmark.renaissance.info.RenaissanceResult;
import org.feuyeux.benchmark.renaissance.info.VMMemory;
import org.feuyeux.benchmark.renaissance.json.JsonParser;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.OptionalDouble;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Slf4j
public class RenaissanceParser {
    public static ResultInfo parse(JsonParser parser, final String root, final String targetName) {
        Path path = Paths.get(root, targetName);
        path = path.resolveSibling(path.getFileName() + ".json");
        RenaissanceResult result = parser.read(path.toAbsolutePath().toString(), RenaissanceResult.class);
        if (result != null) {
            VMMemory vmMemory = result.getEnvironment().getEnvironmentVM().getVmMemory();
            long heapUsage = vmMemory.getVmMemoryHeapUsage().getUsed();
            long nonHeapUsage = vmMemory.getVmMemoryNonheapUsage().getUsed();
            return ResultInfo.builder()
                    .targetName(targetName)
                    .heapUsage(heapUsage/1024/1024)
                    .nonHeapUsage(nonHeapUsage/1024/1024)
                    .benchInfoList(
                            result.getData().entrySet().stream().map(kv -> {
                                String benchName = kv.getKey();
                                double avg = 0;
                                OptionalDouble average =
                                        kv.getValue().getResults().stream().map(r -> {
                                            long durationNs = r.getDurationNs();
                                            return TimeUnit.MILLISECONDS.convert(durationNs, TimeUnit.NANOSECONDS);
                                        }).mapToLong(Long::longValue).average();
                                boolean present = average.isPresent();
                                if (present) {
                                    avg = average.getAsDouble();
                                }
                                return BenchInfo.builder().benchName(benchName).benchValue(avg).build();
                            }).collect(Collectors.toList())
                    ).build();
        }
        return null;
    }
}
