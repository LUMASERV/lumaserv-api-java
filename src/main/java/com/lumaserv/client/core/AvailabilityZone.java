package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class AvailabilityZone {
    @MapperOptions(name = "country_code")
    private String countryCode;
    @MapperOptions(name = "city")
    private String city;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "title")
    private String title;
}

