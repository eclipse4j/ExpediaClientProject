package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@size", "customerSessionId", "Itinerary"})
public class HotelItineraryResponse {

    @JsonProperty("@size")
    private String size;
    @JsonProperty("customerSessionId")
    private String customerSessionId;
    @JsonProperty("Itinerary")
    private Itinerary itinerary;

    @JsonProperty("@size")
    public String getSize() {
        return size;
    }

}
