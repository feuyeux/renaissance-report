package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Data
public class VMMemoryHeapUsage {
    @SerializedName("init")
    private long init;
    @SerializedName("used")
    private long used;
    @SerializedName("committed")
    private long committed;
    @SerializedName("max")
    private long max;
}
