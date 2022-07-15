package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
@Data
public class EnvironmentJRE {
    @SerializedName("java_version")
    private String javaVersion;

    @SerializedName("name")
    private String name;

    @SerializedName("class_path")
    private List<String> classPath;

    @SerializedName("spec_version")
    private String specVersion;

    @SerializedName("spec_vendor")
    private String specVendor;

    @SerializedName("spec_name")
    private String specName;

    @SerializedName("home")
    private String home;

    @SerializedName("version")
    private String version;

    @SerializedName("java_vendor")
    private String javaVendor;

    @SerializedName("library_path")
    private List<String> libraryPath;
}
