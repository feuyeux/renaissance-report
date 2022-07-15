package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Data
public class Environment {
    @SerializedName("os")
    private EnvironmentOS environmentOS;
    @SerializedName("vm")
    private EnvironmentVM environmentVM;
    @SerializedName("jre")
    private EnvironmentJRE jre;
}
