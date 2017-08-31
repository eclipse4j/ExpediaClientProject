package com.tistory.eclipse4j.expedia.api.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = false)
public class FindCondition extends BaseCondition {

    private String cacheKey;

    private String cacheLocation;

    private int numberOfResults = 10;

}
