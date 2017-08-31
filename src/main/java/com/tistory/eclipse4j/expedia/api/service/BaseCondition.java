package com.tistory.eclipse4j.expedia.api.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseCondition {
    
    private ApiExperience apiExperience = ApiExperience.PARTNER_MOBILE_APP;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate arrivalDate;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate departureDate;

    private String countryCode;

    private boolean includeRoomImages = false;

    private String supplierType = "E";

    private List<RoomCondition> rooms;

    public static String MMDDYYYY_SEPA_SLASH = "MM/dd/yyyy";
    private String toExpediaFormat(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(MMDDYYYY_SEPA_SLASH);
        return localDate.format(formatter);
    }
    
    public MultiValueMap<String, String> getArrivalAndDepartureDateParamValue() {
        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<String, String>();
        multiValueMap.add("arrivalDate", toExpediaFormat(arrivalDate)); // MM/DD/YYYY
        multiValueMap.add("departureDate", toExpediaFormat(departureDate));
        return multiValueMap;
    }
    
    public MultiValueMap<String, String> getRoomQueryParamValue() {
        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<String, String>();
        int roomIndex = 1;
        for (RoomCondition roomCondition : rooms) {
            multiValueMap.add("room" + roomIndex, getAppendChildrenQueryParam(roomCondition));
            roomIndex++;
        }
        return multiValueMap;
    }

    private String getAppendChildrenQueryParam(RoomCondition room) {
        StringBuilder builder = new StringBuilder();
        builder.append(room.getNumberOfAdults());
        List<Integer> ages = room.getChildAges();
        if (Objects.isNull(room.getNumberOfChildren()) || room.getNumberOfChildren() == 0) {
            return builder.toString();
        }
        if (CollectionUtils.isEmpty(ages)) {
            return builder.toString();
        }
        for (Integer age : ages) {
            builder.append(",").append(age);
        }
        return builder.toString();
    }
}
