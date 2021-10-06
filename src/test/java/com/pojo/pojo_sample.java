package com.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class pojo_sample {

    @JsonProperty("first_name")
    private String first_name;
    @JsonProperty("last_name")
    private String last_name;

}
