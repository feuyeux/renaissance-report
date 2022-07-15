package org.feuyeux.benchmark.renaissance.info;

import lombok.Data;

import java.util.List;

@Data
public class RenaissanceDataResults {
    private List<RenaissanceDataResult> results;
    private String termination;
}
