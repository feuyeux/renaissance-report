package org.feuyeux.benchmark.renaissance.parse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BenchInfo {
    private String benchName;
    private double benchValue;
}
