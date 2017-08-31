package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"versionId", "cancelTime", "startWindowHours", "nightCount", "currencyCode", "timeZoneDescription"})
public class CancelPolicyInfo {

    @JsonProperty("versionId")
    private Long versionId;

    @JsonProperty("cancelTime")
    private String cancelTime;

    @JsonProperty("startWindowHours")
    private Integer startWindowHours;

    @JsonProperty("nightCount")
    private Integer nightCount;

    @JsonProperty("amount")
    private Double amount;

    @JsonProperty("percent")
    private Double percent;

    @JsonProperty("currencyCode")
    private String currencyCode;

    @JsonProperty("timeZoneDescription")
    private String timeZoneDescription;

}
