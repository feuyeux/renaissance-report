package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Data
public class VMCollector {
    @SerializedName("name")
    private String name;
    @SerializedName("collection_count")
    private long collectionCount;
    @SerializedName("collection_time_ms")
    private long collectionTimeMs;
}
