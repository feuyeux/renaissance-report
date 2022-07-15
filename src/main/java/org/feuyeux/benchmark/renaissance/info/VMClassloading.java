package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Data
public class VMClassloading {
    @SerializedName("class_count")
    private long classCount;
    @SerializedName("classes_total")
    private long classesTotal;
}
