package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Data
public class VMCompiler {
    @SerializedName("name")
    private String name;
    @SerializedName("compilation_time_ms")
    private long compilationTimeMs;
}