package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Data
public class Suite {
    @SerializedName("git")
    private SuiteGit suiteGit;

    @SerializedName("name")
    private String name;

    @SerializedName("version")
    private String version;
}
