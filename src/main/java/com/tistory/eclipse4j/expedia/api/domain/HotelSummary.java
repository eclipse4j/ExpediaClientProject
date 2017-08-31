package com.tistory.eclipse4j.expedia.api.domain;

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
@JsonPropertyOrder({"@order", "hotelId", "name", "address1", "address2", "city", "countryCode", "airportCode",
        "propertyCategory", "hotelRating", "confidenceRating", "amenityMask", "locationDescription", "shortDescription",
        "highRate", "lowRate", "rateCurrencyCode", "latitude", "longitude", "proximityDistance", "proximityUnit",
        "hotelInDestination", "thumbNailUrl", "deepLink", "postalCode"})
public class HotelSummary {

    @JsonProperty("@order")
    private String order;
    @JsonProperty("hotelId")
    private Long hotelId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("address2")
    private String address2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("airportCode")
    private String airportCode;
    @JsonProperty("propertyCategory")
    private Integer propertyCategory;
    @JsonProperty("hotelRating")
    private Double hotelRating;
    @JsonProperty("hotelRatingDisplay")
    private String hotelRatingDisplay;
    @JsonProperty("confidenceRating")
    private Integer confidenceRating;
    @JsonProperty("amenityMask")
    private Integer amenityMask;
    @JsonProperty("locationDescription")
    private String locationDescription;
    @JsonProperty("shortDescription")
    private String shortDescription;
    @JsonProperty("highRate")
    private Double highRate;
    @JsonProperty("lowRate")
    private Double lowRate;
    @JsonProperty("rateCurrencyCode")
    private String rateCurrencyCode;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("proximityDistance")
    private Double proximityDistance;
    @JsonProperty("proximityUnit")
    private String proximityUnit;
    @JsonProperty("hotelInDestination")
    private Boolean hotelInDestination;
    @JsonProperty("thumbNailUrl")
    private String thumbNailUrl;
    @JsonProperty("deepLink")
    private String deepLink;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("RoomRateDetailsList")
    private RoomRateDetailsList roomRateDetailsList;
}
