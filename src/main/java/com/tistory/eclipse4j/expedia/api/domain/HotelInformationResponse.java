package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "@hotelId", "customerSessionId", "HotelSummary", "HotelDetails", "Suppliers", "RoomTypes",
		"PropertyAmenities", "HotelImages" })
public class HotelInformationResponse {
	@JsonProperty("@hotelId")
	private String hotelId;
	@JsonProperty("customerSessionId")
	private String customerSessionId;
	@JsonProperty("HotelSummary")
	private HotelSummary hotelSummary;
	@JsonProperty("HotelDetails")
	private HotelDetails hotelDetails;
	@JsonProperty("Suppliers")
	private Suppliers suppliers;
	@JsonProperty("RoomTypes")
	private RoomTypes roomTypes;
	@JsonProperty("PropertyAmenities")
	private PropertyAmenities propertyAmenities;
	@JsonProperty("HotelImages")
	private HotelImages hotelImages;
}
