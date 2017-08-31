package com.tistory.eclipse4j.expedia.api.rest;

import org.springframework.util.MultiValueMap;

public interface ExpediaRestQueryParamter {
	MultiValueMap<String, String> build();
}
