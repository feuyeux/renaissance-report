package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
@Data
public class EnvironmentVM {

    @SerializedName("termination")
    private String termination;

    @SerializedName("name")
    private String name;

    @SerializedName("classloading")
    private VMClassloading vmClassloading;

    @SerializedName("mode")
    private String mode;

    @SerializedName("args")
    private List<String> args;

    @SerializedName("vendor")
    private String vendor;

    @SerializedName("spec_vendor")
    private String specVendor;

    @SerializedName("spec_name")
    private String specName;

    @SerializedName("compiler")
    private VMCompiler vmCompiler;

    @SerializedName("start_iso")
    private String startIso;

    @SerializedName("collectors")
    private List<VMCollector> vmCollectors;

    @SerializedName("start_unix_ms")
    private long startUnixMs;

    @SerializedName("version")
    private String version;

    @SerializedName("pools")
    private List<VMPool> vmPools;

    @SerializedName("uptime_ms")
    private long uptimeMs;

    @SerializedName("compressed_oops_mode")
    private Object compressedOopsMode;

    @SerializedName("threads")
    private VMThreads vmThreads;

    @SerializedName("spec_version")
    private String specVersion;

    @SerializedName("memory")
    private VMMemory vmMemory;
}
