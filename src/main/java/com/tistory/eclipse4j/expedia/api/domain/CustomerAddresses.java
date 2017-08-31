package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"address1", "city", "stateProvinceCode", "countryCode", "postalCode", "isPrimary", "type"})
public class CustomerAddresses {

    @JsonProperty("address1")
    private String address1;
    @JsonProperty("city")
    private String city;
    @JsonProperty("stateProvinceCode")
    private String stateProvinceCode;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("postalCode")
    private long postalCode;
    @JsonProperty("isPrimary")
    private boolean isPrimary;
    @JsonProperty("type")
    private long type;

}
