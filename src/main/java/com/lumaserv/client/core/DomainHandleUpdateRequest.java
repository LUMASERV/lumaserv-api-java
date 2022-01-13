package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DomainHandleUpdateRequest {
    @MapperOptions(name = "additional_address")
    private String additionalAddress;
    @MapperOptions(name = "birth_region")
    private String birthRegion;
    @MapperOptions(name = "city")
    private String city;
    @MapperOptions(name = "vat_number")
    private String vatNumber;
    @MapperOptions(name = "birth_date")
    private String birthDate;
    @MapperOptions(name = "id_card")
    private String idCard;
    @MapperOptions(name = "birth_place")
    private String birthPlace;
    @MapperOptions(name = "id_card_issue_date")
    private String idCardIssueDate;
    @MapperOptions(name = "labels")
    private Object labels;
    @MapperOptions(name = "birth_country_code")
    private String birthCountryCode;
    @MapperOptions(name = "country_code")
    private String countryCode;
    @MapperOptions(name = "company_registration_number")
    private String companyRegistrationNumber;
    @MapperOptions(name = "phone")
    private String phone;
    @MapperOptions(name = "street")
    private String street;
    @MapperOptions(name = "tax_number")
    private String taxNumber;
    @MapperOptions(name = "street_number")
    private String streetNumber;
    @MapperOptions(name = "postal_code")
    private String postalCode;
    @MapperOptions(name = "region")
    private String region;
    @MapperOptions(name = "fax")
    private String fax;
    @MapperOptions(name = "id_card_authority")
    private String idCardAuthority;
    @MapperOptions(name = "privacy_protection")
    private boolean privacyProtection;
    @MapperOptions(name = "email")
    private String email;
}

