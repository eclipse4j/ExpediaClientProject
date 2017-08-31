package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"policy", "rateCode", "roomTypeCode", "rateDescription", "roomTypeDescription", "supplierType", "propertyId",
        "BedTypes", "smokingPreferences", "rateOccupancyPerRoom", "quotedOccupancy", "minGuestAge", "RateInfos",
        "ValueAdds", "deepLink"})
public class HotelRoomResponse {
    @JsonProperty("policy")
    private String policy;
    @JsonProperty("rateCode")
    private String rateCode;
    @JsonProperty("roomTypeCode")
    private String roomTypeCode;
    @JsonProperty("rateDescription")
    private String rateDescription;
    @JsonProperty("roomTypeDescription")
    private String roomTypeDescription;
    @JsonProperty("supplierType")
    private String supplierType;
    @JsonProperty("propertyId")
    private Long propertyId;
    @JsonProperty("BedTypes")
    private BedTypes bedTypes;
    @JsonProperty("smokingPreferences")
    private String smokingPreferences;
    @JsonProperty("rateOccupancyPerRoom")
    private Integer rateOccupancyPerRoom;
    @JsonProperty("quotedOccupancy")
    private Integer quotedOccupancy;
    @JsonProperty("minGuestAge")
    private Integer minGuestAge;
    @JsonProperty("RateInfos")
    private RateInfos rateInfos;
    @JsonProperty("ValueAdds")
    private ValueAdds valueAdds;
    @JsonProperty("deepLink")
    private String deepLink;
    @JsonProperty("RoomImages")
    private RoomImages roomImages;
    @JsonProperty("RoomType")
    private RoomType roomType;
}
