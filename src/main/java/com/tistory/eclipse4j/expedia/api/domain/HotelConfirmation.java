package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "supplierId", "chainCode", "arrivalDate", "departureDate", "confirmationNumber", "RateInfos",
        "numberOfAdults", "numberOfChildren", "smokingPreference", "supplierPropertyId", "roomTypeCode", "rateCode",
        "rateDescription", "roomDescription", "status", "locale", "ReservationGuest", "Hotel", "nights", "ValueAdds" })
public class HotelConfirmation {

    @JsonProperty("supplierId")
    private long supplierId;
    @JsonProperty("chainCode")
    private String chainCode;
    @JsonProperty("arrivalDate")
    private String arrivalDate;
    @JsonProperty("departureDate")
    private String departureDate;
    @JsonProperty("confirmationNumber")
    private long confirmationNumber;
    @JsonProperty("RateInfos")
    private RateInfos rateInfos;
    @JsonProperty("numberOfAdults")
    private long numberOfAdults;
    @JsonProperty("numberOfChildren")
    private long numberOfChildren;
    @JsonProperty("smokingPreference")
    private String smokingPreference;
    @JsonProperty("supplierPropertyId")
    private long supplierPropertyId;
    @JsonProperty("roomTypeCode")
    private long roomTypeCode;
    @JsonProperty("rateCode")
    private long rateCode;
    @JsonProperty("rateDescription")
    private String rateDescription;
    @JsonProperty("roomDescription")
    private String roomDescription;
    @JsonProperty("status")
    private String status;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("ReservationGuest")
    private ReservationGuest reservationGuest;
    @JsonProperty("Hotel")
    private Hotel hotel;
    @JsonProperty("nights")
    private long nights;
    @JsonProperty("ValueAdds")
    private ValueAdds valueAdds;

}
