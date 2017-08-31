package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "@roomTypeId", "@roomCode", "description", "descriptionLong", "roomAmenities" })
public class RoomType {
	@JsonProperty("@roomTypeId")
	private String roomTypeId;
	@JsonProperty("@roomCode")
	private String roomCode;
	@JsonProperty("description")
	private String description;
	@JsonProperty("descriptionLong")
	private String descriptionLong;
	@JsonProperty("roomAmenities")
	private RoomAmenities roomAmenities;
}
