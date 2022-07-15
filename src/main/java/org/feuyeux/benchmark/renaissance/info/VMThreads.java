package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Data
public class VMThreads {
    @SerializedName("thread_count")
    private long threadCount;
    @SerializedName("thread_count_max")
    private long threadCountMax;
    @SerializedName("daemon_thread_count")
    private long daemonThreadCount;
    @SerializedName("threads_total")
    private long threadsTotal;
}