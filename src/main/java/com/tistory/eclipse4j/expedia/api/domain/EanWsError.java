package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"itineraryId", "handling", "category", "exceptionConditionId", "presentationMessage", "verboseMessage", "ServerInfo"})
@Data
public class EanWsError {

    @JsonProperty("itineraryId")
    private long itineraryId;
    @JsonProperty("handling")
    private String handling;
    @JsonProperty("category")
    private String category;
    @JsonProperty("exceptionConditionId")
    private long exceptionConditionId;
    @JsonProperty("presentationMessage")
    private String presentationMessage;
    @JsonProperty("verboseMessage")
    private String verboseMessage;
    @JsonProperty("ServerInfo")
    private ServerInfo serverInfo;
}
