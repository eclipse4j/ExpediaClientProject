package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ExpediaHotelRoomAvailabilityApiResponse {
    @JsonProperty("HotelRoomAvailabilityResponse")
    private HotelRoomAvailabilityResponse hotelRoomAvailabilityResponse;
}
