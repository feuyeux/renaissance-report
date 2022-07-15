package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Data
public class VMMemory {
    @SerializedName("heap_usage")
    private VMMemoryHeapUsage vmMemoryHeapUsage;
    @SerializedName("nonheap_usage")
    private VMMemoryNonheapUsage vmMemoryNonheapUsage;
    @SerializedName("pending_finalization_count")
    private long pendingFinalizationCount;
}
