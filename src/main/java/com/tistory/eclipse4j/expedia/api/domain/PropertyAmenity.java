package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "amenityId", "amenity" })
public class PropertyAmenity {
	@JsonProperty("amenityId")
	private Integer amenityId;
	@JsonProperty("amenity")
	private String amenity;
}
