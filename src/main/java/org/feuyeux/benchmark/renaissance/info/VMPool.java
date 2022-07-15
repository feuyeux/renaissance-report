package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Data
public class VMPool {
    @SerializedName("name")
    private String name;
    @SerializedName("type")
    private String type;
    @SerializedName("usage")
    private VMPoolUsage vmPoolUsage;
    @SerializedName("peak_usage")
    private VMPoolPeakUsage vmPoolPeakUsage;
}
