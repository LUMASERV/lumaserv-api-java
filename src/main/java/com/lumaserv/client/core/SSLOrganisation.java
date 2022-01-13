package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SSLOrganisation {
    @MapperOptions(name = "additional_address")
    private String additionalAddress;
    @MapperOptions(name = "address")
    private String address;
    @MapperOptions(name = "city")
    private String city;
    @MapperOptions(name = "registration_number")
    private String registrationNumber;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
    @MapperOptions(name = "division")
    private String division;
    @MapperOptions(name = "country_code")
    private String countryCode;
    @MapperOptions(name = "project_id")
    private String projectId;
    @MapperOptions(name = "phone")
    private String phone;
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "duns")
    private String duns;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "postal_code")
    private String postalCode;
    @MapperOptions(name = "region")
    private String region;
    @MapperOptions(name = "fax")
    private String fax;
}

