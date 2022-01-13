package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DebitMandateCreateRequest {
    @MapperOptions(name = "additional_address")
    private String additionalAddress;
    @MapperOptions(name = "bank_code")
    private String bankCode;
    @MapperOptions(name = "account_number")
    private String accountNumber;
    @MapperOptions(name = "city")
    private String city;
    @MapperOptions(name = "country_code")
    private String countryCode;
    @MapperOptions(name = "valid_until")
    private String validUntil;
    @MapperOptions(name = "street")
    private String street;
    @MapperOptions(name = "street_number")
    private String streetNumber;
    @MapperOptions(name = "bank_name")
    private String bankName;
    @MapperOptions(name = "signed_at")
    private String signedAt;
    @MapperOptions(name = "depositor")
    private String depositor;
    @MapperOptions(name = "customer_id")
    private int customerId;
    @MapperOptions(name = "postal_code")
    private String postalCode;
}

