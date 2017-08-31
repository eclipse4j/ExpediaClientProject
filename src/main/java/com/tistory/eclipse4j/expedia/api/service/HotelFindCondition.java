package com.tistory.eclipse4j.expedia.api.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = false)
public class HotelFindCondition extends FindCondition {

    private Long geographyId;

    private String city;

    private HotelSort sort = HotelSort.DEFAULT;

    private String options;
}
