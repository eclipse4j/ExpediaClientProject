package com.tistory.eclipse4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.tistory.eclipse4j.expedia.api.domain.ExpediaHotelListApiResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonReader {
    public static ExpediaHotelListApiResponse get(String jsonFile) {
        try {
            InputStream jsonInputStream = JsonReader.class.getClassLoader().getResourceAsStream(jsonFile);
            String json = readToString(jsonInputStream);
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            objectMapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector());
            
            ExpediaHotelListApiResponse pojo = objectMapper.readValue(json, ExpediaHotelListApiResponse.class);
            return pojo;
        } catch (Exception e) {
            log.error("Error ", e);
        }
        return new ExpediaHotelListApiResponse();
    }

    public static String readToString(InputStream input) throws IOException {
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(input))) {
            return buffer.lines().collect(Collectors.joining("\n"));
        }
    }
}
