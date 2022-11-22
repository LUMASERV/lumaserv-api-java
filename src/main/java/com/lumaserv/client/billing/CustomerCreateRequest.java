package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class CustomerCreateRequest {
    @MapperOptions(name = "additional_address")
    private String additionalAddress;
    @MapperOptions(name = "gender")
    private String gender;
    @MapperOptions(name = "city")
    private String city;
    @MapperOptions(name = "last_name")
    private String lastName;
    @MapperOptions(name = "billing_interval")
    private BillingInterval billingInterval;
    @MapperOptions(name = "custom_vat_rate")
    private float customVatRate;
    @MapperOptions(name = "country_code")
    private String countryCode;
    @MapperOptions(name = "user_id")
    private java.util.UUID userId;
    @MapperOptions(name = "street")
    private String street;
    @MapperOptions(name = "tax_number")
    private String taxNumber;
    @MapperOptions(name = "company_name")
    private String companyName;
    @MapperOptions(name = "auto_finalize")
    private boolean autoFinalize;
    @MapperOptions(name = "street_number")
    private String streetNumber;
    @MapperOptions(name = "credit_limit")
    private float creditLimit;
    @MapperOptions(name = "payment_period")
    private int paymentPeriod;
    @MapperOptions(name = "vat_id")
    private String vatId;
    @MapperOptions(name = "postal_code")
    private String postalCode;
    @MapperOptions(name = "first_name")
    private String firstName;
    @MapperOptions(name = "email")
    private String email;
}

