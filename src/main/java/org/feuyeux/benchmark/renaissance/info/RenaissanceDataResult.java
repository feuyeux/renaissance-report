package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Data
public class RenaissanceDataResult {
    @SerializedName("duration_ns")
    private long durationNs;

    @SerializedName("uptime_ns")
    private long uptimeNs;

    /**
     * No args constructor for use in serialization
     */
    private RenaissanceDataResult() {
    }

    /**
     * @param uptimeNs
     * @param durationNs
     */
    private RenaissanceDataResult(long durationNs, long uptimeNs) {
        super();
        this.durationNs = durationNs;
        this.uptimeNs = uptimeNs;
    }

    private RenaissanceDataResult withDurationNs(long durationNs) {
        this.durationNs = durationNs;
        return this;
    }

    private RenaissanceDataResult withUptimeNs(long uptimeNs) {
        this.uptimeNs = uptimeNs;
        return this;
    }

}
