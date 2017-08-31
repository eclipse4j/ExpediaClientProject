package com.tistory.eclipse4j.expedia.api;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ExpediaRestTemplate {

    @Autowired
    @Qualifier("restTemplate")
    private RestTemplate restTemplate;

    public <T> ResponseEntity<T> get(ExpediaRestParameter outBoundRestParameter, ParameterizedTypeReference<T> reference) {
        URI apiUrl = outBoundRestParameter.url();
        ResponseEntity<T> entity = restTemplate.exchange(apiUrl, HttpMethod.GET, outBoundRestParameter.headers(), reference);
        log.info("{}", entity.getBody());
        return entity;
    }

    public <T> ResponseEntity<T> post(ExpediaRestParameter outBoundRestParameter, ParameterizedTypeReference<T> reference) {
        URI apiUrl = outBoundRestParameter.url();
        ResponseEntity<T> entity = restTemplate.exchange(apiUrl, HttpMethod.POST, outBoundRestParameter.headers(), reference);
        return entity;
    }
}
