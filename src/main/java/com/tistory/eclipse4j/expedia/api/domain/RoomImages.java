package com.tistory.eclipse4j.expedia.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "@size", "RoomImage" })
public class RoomImages {
    @JsonProperty("@size")
    private int size;

    @JsonProperty("RoomImage")
    private List<RoomImage> roomImages;
}