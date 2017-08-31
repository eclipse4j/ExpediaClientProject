package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ExpediaHotelRoomReservationApiResponse {
    @JsonProperty("HotelRoomReservationResponse")
    private HotelRoomReservationResponse hotelRoomReservationResponse;
}
