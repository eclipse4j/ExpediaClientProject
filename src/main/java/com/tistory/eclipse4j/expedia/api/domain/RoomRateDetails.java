package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"roomTypeCode", "rateCode", "maxRoomOccupancy", "quotedRoomOccupancy", "minGuestAge",
        "roomDescription", "propertyAvailable", "propertyRestricted", "expediaPropertyId", "RateInfos", "ValueAdds",
        "smokingPreferences", "currentAllotment", "promoDescription"})
public class RoomRateDetails {

    @JsonProperty("roomTypeCode")
    private int roomTypeCode;
    @JsonProperty("rateCode")
    private int rateCode;
    @JsonProperty("maxRoomOccupancy")
    private int maxRoomOccupancy;
    @JsonProperty("quotedRoomOccupancy")
    private int quotedRoomOccupancy;
    @JsonProperty("minGuestAge")
    private int minGuestAge;
    @JsonProperty("roomDescription")
    private String roomDescription;
    @JsonProperty("propertyAvailable")
    private boolean propertyAvailable;
    @JsonProperty("propertyRestricted")
    private boolean propertyRestricted;
    @JsonProperty("expediaPropertyId")
    private int expediaPropertyId;
    @JsonProperty("RateInfos")
    private RateInfos rateInfos;
    @JsonProperty("ValueAdds")
    private ValueAdds valueAdds;
    @JsonProperty("smokingPreferences")
    private String smokingPreferences;
    @JsonProperty("currentAllotment")
    private int currentAllotment;
    @JsonProperty("promoDescription")
    private String promoDescription;

}
