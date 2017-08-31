package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"hotelId", "statusCode", "name", "address1", "address2", "city", "stateProvinceCode", "countryCode", "postalCode", "phone", "fax", "latitude", "longitude",
        "coordinateAccuracyCode", "lowRate", "highRate", "confidence", "hotelRating", "tripAdvisorRating", "theme", "specialCheckInInstructions"})
public class Hotel {

    @JsonProperty("hotelId")
    private long hotelId;
    @JsonProperty("statusCode")
    private String statusCode;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("address2")
    private String address2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("stateProvinceCode")
    private String stateProvinceCode;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("postalCode")
    private long postalCode;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("fax")
    private String fax;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("coordinateAccuracyCode")
    private long coordinateAccuracyCode;
    @JsonProperty("lowRate")
    private long lowRate;
    @JsonProperty("highRate")
    private long highRate;
    @JsonProperty("confidence")
    private long confidence;
    @JsonProperty("hotelRating")
    private String hotelRating;
    @JsonProperty("tripAdvisorRating")
    private long tripAdvisorRating;
    @JsonProperty("theme")
    private String theme;
    @JsonProperty("specialCheckInInstructions")
    private String specialCheckInInstructions;

}
