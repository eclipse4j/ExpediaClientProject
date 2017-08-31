package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@averageBaseRate", "@averageRate", "@commissionableUsdTotal", "@currencyCode", "@maxNightlyRate",
        "@nightlyRateTotal", "@surchargeTotal", "@total", "NightlyRatesPerRoom", "Surcharges"})
public class ChargeableRateInfo {

    @JsonProperty("@averageBaseRate")
    private String averageBaseRate;
    @JsonProperty("@averageRate")
    private String averageRate;
    @JsonProperty("@commissionableUsdTotal")
    private String commissionableUsdTotal;
    @JsonProperty("@currencyCode")
    private String currencyCode;
    @JsonProperty("@maxNightlyRate")
    private String maxNightlyRate;
    @JsonProperty("@nightlyRateTotal")
    private String nightlyRateTotal;
    @JsonProperty("@surchargeTotal")
    private String surchargeTotal;
    @JsonProperty("@total")
    private String total;
    @JsonProperty("NightlyRatesPerRoom")
    private NightlyRatesPerRoom nightlyRatesPerRoom;
    @JsonProperty("Surcharges")
    private Surcharges surcharges;

}
