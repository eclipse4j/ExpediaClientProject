package com.tistory.eclipse4j.expedia.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.tistory.eclipse4j.expedia.api.domain.ExpediaHotelListApiResponse;
import com.tistory.eclipse4j.expedia.api.domain.HotelListResponse;
import com.tistory.eclipse4j.expedia.api.rest.ExpediaRestApiTemplate;
import com.tistory.eclipse4j.expedia.api.rest.ExpediaRestQueryParamter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class HotelFindService {

    @Autowired
    private ExpediaRestApiTemplate expediaRestApiTemplate;


    public HotelListResponse findByCity(final HotelFindCondition condition) {
        log.debug("[EAN] ExpediaHotelFindCondition={}", condition);
        ExpediaHotelListApiResponse expediaHotelApiResponse = expediaRestApiTemplate.get("/ean-services/rs/hotel/v3/list", new ExpediaRestQueryParamter() {
            @Override
            public MultiValueMap<String, String> build() {
                MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
                queryParams.add("city", condition.getCity());
                queryParams.add("countryCode", condition.getCountryCode());
                queryParams.add("options", condition.getOptions());
                queryParams.add("sort", condition.getSort().name());
                queryParams.add("supplierType", condition.getSupplierType());
                queryParams.add("numberOfResults", String.valueOf(condition.getNumberOfResults()));
                queryParams.putAll(condition.getArrivalAndDepartureDateParamValue());
                return queryParams;
            }
        }, new ParameterizedTypeReference<ExpediaHotelListApiResponse>() {
        });
        HotelListResponse expediaHotelListResponse = expediaHotelApiResponse.getExpediaHotelListResponse();
        return expediaHotelListResponse;
    }
}
