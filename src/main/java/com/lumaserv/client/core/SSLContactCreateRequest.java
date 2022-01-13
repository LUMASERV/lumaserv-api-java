package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SSLContactCreateRequest {
    @MapperOptions(name = "additional_address")
    private String additionalAddress;
    @MapperOptions(name = "address")
    private String address;
    @MapperOptions(name = "city")
    private String city;
    @MapperOptions(name = "last_name")
    private String lastName;
    @MapperOptions(name = "organisation")
    private String organisation;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
    @MapperOptions(name = "country_code")
    private String countryCode;
    @MapperOptions(name = "project_id")
    private String projectId;
    @MapperOptions(name = "phone")
    private String phone;
    @MapperOptions(name = "fax")
    private String fax;
    @MapperOptions(name = "postal_code")
    private String postalCode;
    @MapperOptions(name = "region")
    private String region;
    @MapperOptions(name = "first_name")
    private String firstName;
    @MapperOptions(name = "email")
    private String email;
}

