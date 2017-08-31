package com.tistory.eclipse4j.expedia.api.service;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RoomCondition {

    private Integer numberOfRooms = 1;

    private Integer numberOfAdults = 2;

    private Integer numberOfChildren = 0;

    private List<Integer> childAges;

    private String roomBedTypeId;

}

