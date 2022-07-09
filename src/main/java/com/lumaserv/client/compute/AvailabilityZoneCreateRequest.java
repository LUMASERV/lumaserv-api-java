package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class AvailabilityZoneCreateRequest {
    @MapperOptions(name = "country_code")
    private String countryCode;
    @MapperOptions(name = "city")
    private String city;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "config")
    private AbstractObject config;
}

