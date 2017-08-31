package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customerSessionId", "itineraryId", "confirmationNumbers", "processedWithConfirmation", "supplierType", "reservationStatusCode", "existingItinerary",
        "numberOfRoomsBooked", "drivingDirections", "checkInInstructions", "arrivalDate", "departureDate", "hotelName", "hotelAddress", "hotelCity", "hotelStateProvinceCode",
        "hotelPostalCode", "hotelCountryCode", "roomDescription", "rateOccupancyPerRoom", "RateInfos", "ValueAdds"})
public class HotelRoomReservationResponse {
    @JsonProperty("customerSessionId")
    private String customerSessionId;
    @JsonProperty("itineraryId")
    private long itineraryId;
    @JsonProperty("confirmationNumbers")
    private long confirmationNumbers;
    @JsonProperty("processedWithConfirmation")
    private boolean processedWithConfirmation;
    @JsonProperty("errorText")
    private String errorText;
    @JsonProperty("hotelReplyText")
    private String hotelReplyText;  
    @JsonProperty("supplierType")
    private String supplierType;
    @JsonProperty("reservationStatusCode")
    private String reservationStatusCode;
    @JsonProperty("existingItinerary")
    private boolean existingItinerary;
    @JsonProperty("numberOfRoomsBooked")
    private long numberOfRoomsBooked;
    @JsonProperty("drivingDirections")
    private String drivingDirections;
    @JsonProperty("checkInInstructions")
    private String checkInInstructions;
    @JsonProperty("arrivalDate")
    private String arrivalDate;
    @JsonProperty("departureDate")
    private String departureDate;
    @JsonProperty("hotelName")
    private String hotelName;
    @JsonProperty("hotelAddress")
    private String hotelAddress;
    @JsonProperty("hotelCity")
    private String hotelCity;
    @JsonProperty("hotelStateProvinceCode")
    private String hotelStateProvinceCode;
    @JsonProperty("hotelPostalCode")
    private long hotelPostalCode;
    @JsonProperty("hotelCountryCode")
    private String hotelCountryCode;
    @JsonProperty("roomDescription")
    private String roomDescription;
    @JsonProperty("rateOccupancyPerRoom")
    private long rateOccupancyPerRoom;
    @JsonProperty("RateInfos")
    private RateInfos rateInfos;
    @JsonProperty("ValueAdds")
    private ValueAdds valueAdds;
    @JsonProperty("EanWsError")
    private EanWsError eanWsError;
    
    public boolean hasErrors(){
        return eanWsError != null;
    }
}
