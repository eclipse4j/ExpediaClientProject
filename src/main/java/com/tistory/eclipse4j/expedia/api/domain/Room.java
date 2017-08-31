package com.tistory.eclipse4j.expedia.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"numberOfAdults", "numberOfChildren", "rateKey", "ChargeableNightlyRates", "ConvertedNightlyRates"})
public class Room {

    @JsonProperty("numberOfAdults")
    private Integer numberOfAdults;
    @JsonProperty("numberOfChildren")
    private Integer numberOfChildren;
    @JsonProperty("rateKey")
    private String rateKey;
    @JsonProperty("ChargeableNightlyRates")
    private List<ChargeableNightlyRate> chargeableNightlyRates = null;
    @JsonProperty("ConvertedNightlyRates")
    private List<ConvertedNightlyRate> convertedNightlyRates = null;

}
