package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Data
public class EnvironmentOS {

    @SerializedName("virt_mem_committed")
    private long virtMemCommitted;

    @SerializedName("name")
    private String name;

    @SerializedName("open_fd_count")
    private long openFdCount;

    @SerializedName("available_processors")
    private long availableProcessors;

    @SerializedName("phys_mem_total")
    private long physMemTotal;

    @SerializedName("version")
    private String version;

    @SerializedName("arch")
    private String arch;

    @SerializedName("max_fd_count")
    private long maxFdCount;

    @SerializedName("swap_space_free")
    private long swapSpaceFree;

    @SerializedName("phys_mem_free")
    private long physMemFree;

    @SerializedName("swap_space_total")
    private long swapSpaceTotal;

}
