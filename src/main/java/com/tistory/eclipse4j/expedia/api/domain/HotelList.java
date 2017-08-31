package com.tistory.eclipse4j.expedia.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@size", "@activePropertyCount", "HotelSummary"})
public class HotelList {

    @JsonProperty("@size")
    private int size;

    @JsonProperty("@activePropertyCount")
    private int activePropertyCount;

    @JsonProperty("HotelSummary")
    private List<HotelSummary> hotelSummary;
}
