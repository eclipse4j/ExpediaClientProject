package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"numberOfRooms", "numberOfFloors", "checkInTime", "checkOutTime", "propertyInformation",
        "areaInformation", "propertyDescription", "hotelPolicy", "roomInformation", "drivingDirections",
        "checkInInstructions", "amenitiesDescription", "businessAmenitiesDescription", "diningDescription"
        ,"renovationsDescription", "roomDetailDescription", "specialCheckInInstructions"})
public class HotelDetails {
    @JsonProperty("numberOfRooms")
    private Integer numberOfRooms;
    @JsonProperty("numberOfFloors")
    private Integer numberOfFloors;
    @JsonProperty("checkInTime")
    private String checkInTime;
    @JsonProperty("checkOutTime")
    private String checkOutTime;
    @JsonProperty("propertyInformation")
    private String propertyInformation;
    @JsonProperty("areaInformation")
    private String areaInformation;
    @JsonProperty("propertyDescription")
    private String propertyDescription;
    @JsonProperty("hotelPolicy")
    private String hotelPolicy;
    @JsonProperty("roomInformation")
    private String roomInformation;
    @JsonProperty("drivingDirections")
    private String drivingDirections;
    @JsonProperty("checkInInstructions")
    private String checkInInstructions;
    @JsonProperty("amenitiesDescription")
    private String amenitiesDescription;
    @JsonProperty("businessAmenitiesDescription")
    private String businessAmenitiesDescription;
    @JsonProperty("diningDescription")
    private String diningDescription;
    @JsonProperty("renovationsDescription")
    private String renovationsDescription;
    @JsonProperty("roomDetailDescription")
    private String roomDetailDescription;
    @JsonProperty("specialCheckInInstructions")
    private String specialCheckInInstructions;
}
