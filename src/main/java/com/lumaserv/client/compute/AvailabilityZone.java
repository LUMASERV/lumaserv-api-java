package com.lumaserv.client.compute;

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
    private java.util.UUID id;
    @MapperOptions(name = "title")
    private String title;
}

