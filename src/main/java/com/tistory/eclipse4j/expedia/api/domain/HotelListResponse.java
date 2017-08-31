package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerSessionId", "cacheKey", "cacheLocation", "numberOfRoomsRequested", "moreResultsAvailable", "cachedSupplierResponse",
        "HotelList"})
public class HotelListResponse {
    @JsonProperty("customerSessionId")
    private String customerSessionId;

    @JsonProperty("cacheKey")
    private String cacheKey;

    @JsonProperty("cacheLocation")
    private String cacheLocation;

    @JsonProperty("numberOfRoomsRequested")
    private int numberOfRoomsRequested;

    @JsonProperty("moreResultsAvailable")
    private boolean moreResultsAvailable;

    @JsonProperty("cachedSupplierResponse")
    private CachedSupplierResponse cachedSupplierResponse;
    
    @JsonProperty("HotelList")
    private HotelList hotelList;
}
