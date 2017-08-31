package com.tistory.eclipse4j.expedia.api.rest;

import java.math.BigInteger;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.tistory.eclipse4j.expedia.api.ExpediaRestParameter;
import com.tistory.eclipse4j.expedia.api.ExpediaRestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ExpediaRestApiTemplate {

    @Autowired
    private ExpediaRestTemplate expediaRestTemplate;

    @Value("${expedia.api.cid}")
    private String cid;

    @Value("${expedia.api.key}")
    private String apiKey;

    @Value("${expedia.api.secret}")
    private String secret;

    @Value("${expedia.api.server.host}")
    private String expediaURL;

    @Value("${expedia.api.book.server.host}")
    private String expediaBookURL;

    @Value("${expedia.api.locale}")
    private String locale;

    @Value("${expedia.api.currency}")
    private String currencyCode;

    @Value("${expedia.api.minor.rev}")
    private String minorRev;

    @Value("${expedia.api.message.digest.type}")
    private String messageDigestType;

    public <T> T post(final String path, final ExpediaRestQueryParamter paramter, ParameterizedTypeReference<T> reference) {
        return expediaRestTemplate.post(new ExpediaRestParameter() {
            @Override
            public HttpEntity<?> headers() {
                MultiValueMap<String, String> queryParams = paramter.build();
                addDefaultQueryParams(queryParams);
                HttpHeaders headers = new HttpHeaders();
                headers.add("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                HttpEntity<?> request = new HttpEntity<Object>(queryParams, headers);
                return request;
            }

            @Override
            public URI url() {
                URI url = UriComponentsBuilder.fromHttpUrl(expediaBookURL + path).build().toUri();
                log.info("[EAN] Api URL : {}", url);
                return url;
            }
        }, reference).getBody();
    }

    public <T> T get(final String path, final ExpediaRestQueryParamter paramter, ParameterizedTypeReference<T> reference) {
        return expediaRestTemplate.get(new ExpediaRestParameter() {
            @Override
            public HttpEntity<?> headers() {
                return null;
            }

            @Override
            public URI url() {
                MultiValueMap<String, String> queryParams = paramter.build();
                addDefaultQueryParams(queryParams);
                try {
                    URI url = UriComponentsBuilder.fromHttpUrl(expediaURL + path).queryParams(queryParams).build().toUri();
                    return url;
                } catch (Exception e) {
                    log.error("[EAN] Api Url Error = {}", e.getMessage(), e);
                    throw new RuntimeException(e.getMessage());
                }
            }
        }, reference).getBody();
    }

    /**
     * minorRev:99
     */
    private void addDefaultQueryParams(MultiValueMap<String, String> queryParams) {
        queryParams.add("cid", cid);
        queryParams.add("apiKey", apiKey);
        queryParams.add("locale", locale);
        queryParams.add("currencyCode", currencyCode);
        queryParams.add("minorRev", minorRev);
        queryParams.add("sig", getSecretSignatureKey(apiKey, secret));
    }

    private String getSecretSignatureKey(String apiKey, String secret) {
        try {
            MessageDigest md = MessageDigest.getInstance(messageDigestType);
            long timeInSeconds = (System.currentTimeMillis() / 1000);
            String input = apiKey + secret + timeInSeconds;
            md.update(input.getBytes());
            return String.format("%032x", new BigInteger(1, md.digest()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException();
        }
    }

}
