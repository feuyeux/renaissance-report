package org.feuyeux.benchmark.renaissance;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.feuyeux.benchmark.renaissance.json.JsonParser;
import org.feuyeux.benchmark.renaissance.parse.BenchInfo;
import org.feuyeux.benchmark.renaissance.parse.RenaissanceParser;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
public class RenaissanceParserTest {
    @Test
    public void testParse() {
        Path resourceDirectory = Paths.get("src", "test", "resources");
        String path = resourceDirectory.toAbsolutePath().toString();
        JsonParser parser = new JsonParser();
        ArrayList<String> benchNames = Lists.newArrayList(
                "openjdk-11");
        benchNames.stream().map(
                targetName -> RenaissanceParser.parse(parser, path, targetName)
        ).filter(Objects::nonNull).forEach(r -> {
            List<BenchInfo> benchInfoList = r.getBenchInfoList();
            log.info("{}", r.getTargetName());
            benchInfoList.forEach(b -> log.info("{}\t{}", b.getBenchName(), b.getBenchValue()));
        });
    }
}
