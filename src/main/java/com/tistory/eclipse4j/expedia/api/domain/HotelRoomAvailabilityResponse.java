package com.tistory.eclipse4j.expedia.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@size", "customerSessionId", "hotelId", "arrivalDate", "departureDate", "hotelName",
        "hotelAddress", "hotelCity", "hotelStateProvince", "hotelCountry", "numberOfRoomsRequested",
        "checkInInstructions", "specialCheckInInstructions", "HotelRoomResponse"})
public class HotelRoomAvailabilityResponse {

    @JsonProperty("@size")
    private String size;
    @JsonProperty("customerSessionId")
    private String customerSessionId;
    @JsonProperty("hotelId")
    private Long hotelId;
    @JsonProperty("arrivalDate")
    private String arrivalDate;
    @JsonProperty("departureDate")
    private String departureDate;
    @JsonProperty("hotelName")
    private String hotelName;
    @JsonProperty("hotelAddress")
    private String hotelAddress;
    @JsonProperty("hotelCity")
    private String hotelCity;
    @JsonProperty("hotelStateProvince")
    private String hotelStateProvince;
    @JsonProperty("hotelCountry")
    private String hotelCountry;
    @JsonProperty("numberOfRoomsRequested")
    private Integer numberOfRoomsRequested;
    @JsonProperty("checkInInstructions")
    private String checkInInstructions;
    @JsonProperty("specialCheckInInstructions")
    private String specialCheckInInstructions;
    @JsonProperty("HotelRoomResponse")
    private List<HotelRoomResponse> hotelRoomResponse = null;
}
