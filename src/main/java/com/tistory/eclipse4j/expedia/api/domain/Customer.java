package com.tistory.eclipse4j.expedia.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"email", "firstName", "lastName", "homePhone", "workPhone", "CustomerAddresses"})
public class Customer {

    @JsonProperty("email")
    private String email;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("homePhone")
    private long homePhone;
    @JsonProperty("workPhone")
    private long workPhone;
    @JsonProperty("CustomerAddresses")
    private CustomerAddresses customerAddresses;

}
