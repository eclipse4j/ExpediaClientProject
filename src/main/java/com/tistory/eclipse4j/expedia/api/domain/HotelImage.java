package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "hotelImageId", "name", "category", "type", "caption", "url", "thumbnailUrl", "supplierId",
		"width", "height", "byteSize" })
public class HotelImage {
	@JsonProperty("hotelImageId")
	private Integer hotelImageId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("category")
	private Integer category;
	@JsonProperty("type")
	private Integer type;
	@JsonProperty("caption")
	private String caption;
	@JsonProperty("url")
	private String url;
	@JsonProperty("thumbnailUrl")
	private String thumbnailUrl;
	@JsonProperty("supplierId")
	private Integer supplierId;
	@JsonProperty("width")
	private Integer width;
	@JsonProperty("height")
	private Integer height;
	@JsonProperty("byteSize")
	private Integer byteSize;
}
