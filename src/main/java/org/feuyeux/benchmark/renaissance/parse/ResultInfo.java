package org.feuyeux.benchmark.renaissance.parse;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ResultInfo {
    private String targetName;
    private List<BenchInfo> benchInfoList;
}
