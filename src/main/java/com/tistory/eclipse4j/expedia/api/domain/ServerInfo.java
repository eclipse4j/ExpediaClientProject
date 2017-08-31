package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@instance", "@timestamp", "@serverTime"})
public class ServerInfo {
    @JsonProperty("@instance")
    private String instance;
    @JsonProperty("@timestamp")
    private String timestamp;
    @JsonProperty("@serverTime")
    private String serverTime;
}
