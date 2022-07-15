package org.feuyeux.benchmark.renaissance.info;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Data
public class SuiteGit {
    @SerializedName("commit_hash")
    private String commitHash;
    @SerializedName("commit_date")
    private String commitDate;
    @SerializedName("dirty")
    private String dirty;
}
