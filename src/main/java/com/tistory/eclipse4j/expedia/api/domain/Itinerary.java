package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"itineraryId", "affiliateId", "creationDate", "creationTime", "itineraryStartDate", "itineraryEndDate", "Customer", "HotelConfirmation"})
public class Itinerary {

    @JsonProperty("itineraryId")
    private long itineraryId;
    @JsonProperty("affiliateId")
    private long affiliateId;
    @JsonProperty("creationDate")
    private String creationDate;
    @JsonProperty("creationTime")
    private String creationTime;
    @JsonProperty("itineraryStartDate")
    private String itineraryStartDate;
    @JsonProperty("itineraryEndDate")
    private String itineraryEndDate;
    @JsonProperty("Customer")
    private Customer customer;
    @JsonProperty("HotelConfirmation")
    private HotelConfirmation hotelConfirmation;

}
