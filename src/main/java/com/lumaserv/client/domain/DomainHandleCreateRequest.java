package com.lumaserv.client.domain;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DomainHandleCreateRequest {
    @MapperOptions(name = "birth_region")
    private String birthRegion;
    @MapperOptions(name = "gender")
    private String gender;
    @MapperOptions(name = "city")
    private String city;
    @MapperOptions(name = "vat_number")
    private String vatNumber;
    @MapperOptions(name = "birth_date")
    private String birthDate;
    @MapperOptions(name = "id_card")
    private String idCard;
    @MapperOptions(name = "organisation")
    private String organisation;
    @MapperOptions(name = "type")
    private String type;
    @MapperOptions(name = "birth_country_code")
    private String birthCountryCode;
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "street")
    private String street;
    @MapperOptions(name = "tax_number")
    private String taxNumber;
    @MapperOptions(name = "fax")
    private String fax;
    @MapperOptions(name = "id_card_authority")
    private String idCardAuthority;
    @MapperOptions(name = "first_name")
    private String firstName;
    @MapperOptions(name = "email")
    private String email;
    @MapperOptions(name = "additional_address")
    private String additionalAddress;
    @MapperOptions(name = "last_name")
    private String lastName;
    @MapperOptions(name = "birth_place")
    private String birthPlace;
    @MapperOptions(name = "id_card_issue_date")
    private String idCardIssueDate;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
    @MapperOptions(name = "country_code")
    private String countryCode;
    @MapperOptions(name = "company_registration_number")
    private String companyRegistrationNumber;
    @MapperOptions(name = "phone")
    private String phone;
    @MapperOptions(name = "street_number")
    private String streetNumber;
    @MapperOptions(name = "postal_code")
    private String postalCode;
    @MapperOptions(name = "region")
    private String region;
    @MapperOptions(name = "privacy_protection")
    private boolean privacyProtection;
}

