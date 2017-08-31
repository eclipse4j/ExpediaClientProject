package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@priceBreakdown", "@promo", "@rateChange", "RoomGroup", "ChargeableRateInfo", "ConvertedRateInfo",
        "cancellationPolicy", "CancelPolicyInfoList", "nonRefundable", "rateType", "promoId", "promoDescription",
        "promoType", "currentAllotment", "guaranteeRequired", "depositRequired", "taxRate", "promoDetailText"})
public class RateInfo {

    @JsonProperty("@priceBreakdown")
    private String priceBreakdown;
    @JsonProperty("@promo")
    private String promo;
    @JsonProperty("@rateChange")
    private String rateChange;
    @JsonProperty("RoomGroup")
    private RoomGroup roomGroup;
    @JsonProperty("ChargeableRateInfo")
    private ChargeableRateInfo chargeableRateInfo;
    @JsonProperty("ConvertedRateInfo")
    private ConvertedRateInfo convertedRateInfo;
    @JsonProperty("cancellationPolicy")
    private String cancellationPolicy;
    @JsonProperty("CancelPolicyInfoList")
    private CancelPolicyInfoList cancelPolicyInfoList;
    @JsonProperty("nonRefundable")
    private Boolean nonRefundable;
    @JsonProperty("rateType")
    private String rateType;
    @JsonProperty("promoId")
    private Long promoId;
    @JsonProperty("promoDescription")
    private String promoDescription;
    @JsonProperty("promoType")
    private String promoType;
    @JsonProperty("currentAllotment")
    private Integer currentAllotment;
    @JsonProperty("guaranteeRequired")
    private Boolean guaranteeRequired;
    @JsonProperty("depositRequired")
    private Boolean depositRequired;
    @JsonProperty("taxRate")
    private Double taxRate;
    @JsonProperty("promoDetailText")
    private String promoDetailText;

}
