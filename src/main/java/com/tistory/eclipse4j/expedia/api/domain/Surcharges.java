package com.tistory.eclipse4j.expedia.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@size", "Surcharge"})
public class Surcharges {

    @JsonProperty("@size")
    private String size;
    @JsonProperty("Surcharge")
    private List<Surcharge> surcharge;

}
