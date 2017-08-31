package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@baseRate", "@rate", "@promo", "@fenced"})
public class NightlyRate {

    @JsonProperty("@baseRate")
    private String baseRate;
    @JsonProperty("@rate")
    private String rate;
    @JsonProperty("@promo")
    private String promo;
    @JsonProperty("@fenced")
    private String fenced;

}
