package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ExpediaHotelRoomReservationCancelApiResponse {
    
    @JsonProperty("HotelRoomCancellationResponse")
    private HotelRoomCancellationResponse hotelRoomCancellationResponse;
}
