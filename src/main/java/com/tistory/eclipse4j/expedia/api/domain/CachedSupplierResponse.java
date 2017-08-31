package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "@supplierCacheTolerance",
        "@cachedTime",
        "@candidatePreptime",
        "@otherOverheadTime",
        "@tpidUsed",
        "@matchedCurrency",
        "@matchedLocale"
})
public class CachedSupplierResponse {

    @JsonProperty("@supplierCacheTolerance")
    private String supplierCacheTolerance;
    @JsonProperty("@cachedTime")
    private String cachedTime;
    @JsonProperty("@candidatePreptime")
    private String candidatePreptime;
    @JsonProperty("@otherOverheadTime")
    private String otherOverheadTime;
    @JsonProperty("@tpidUsed")
    private String tpidUsed;
    @JsonProperty("@matchedCurrency")
    private String matchedCurrency;
    @JsonProperty("@matchedLocale")
    private String matchedLocale;

    @JsonProperty("@supplierCacheTolerance")
    public String getSupplierCacheTolerance() {
        return supplierCacheTolerance;
    }

    @JsonProperty("@supplierCacheTolerance")
    public void setSupplierCacheTolerance(String supplierCacheTolerance) {
        this.supplierCacheTolerance = supplierCacheTolerance;
    }

    @JsonProperty("@cachedTime")
    public String getCachedTime() {
        return cachedTime;
    }

    @JsonProperty("@cachedTime")
    public void setCachedTime(String cachedTime) {
        this.cachedTime = cachedTime;
    }

    @JsonProperty("@candidatePreptime")
    public String getCandidatePreptime() {
        return candidatePreptime;
    }

    @JsonProperty("@candidatePreptime")
    public void setCandidatePreptime(String candidatePreptime) {
        this.candidatePreptime = candidatePreptime;
    }

    @JsonProperty("@otherOverheadTime")
    public String getOtherOverheadTime() {
        return otherOverheadTime;
    }

    @JsonProperty("@otherOverheadTime")
    public void setOtherOverheadTime(String otherOverheadTime) {
        this.otherOverheadTime = otherOverheadTime;
    }

    @JsonProperty("@tpidUsed")
    public String getTpidUsed() {
        return tpidUsed;
    }

    @JsonProperty("@tpidUsed")
    public void setTpidUsed(String tpidUsed) {
        this.tpidUsed = tpidUsed;
    }

    @JsonProperty("@matchedCurrency")
    public String getMatchedCurrency() {
        return matchedCurrency;
    }

    @JsonProperty("@matchedCurrency")
    public void setMatchedCurrency(String matchedCurrency) {
        this.matchedCurrency = matchedCurrency;
    }

    @JsonProperty("@matchedLocale")
    public String getMatchedLocale() {
        return matchedLocale;
    }

    @JsonProperty("@matchedLocale")
    public void setMatchedLocale(String matchedLocale) {
        this.matchedLocale = matchedLocale;
    }

}
