package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

@Generated("jsonschema2pojo")
@Data
public class RenaissanceResult {
    @SerializedName("benchmarks")
    private List<String> benchmarks;

    @SerializedName("format_version")
    private long formatVersion;

    @SerializedName("data")
    private Map<String, RenaissanceDataResults> data;

    @SerializedName("environment")
    private Environment environment;

    @SerializedName("suite")
    private Suite suite;
}
