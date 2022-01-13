package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class AvailabilityZoneCreateRequest {
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "config")
    private AbstractObject config;
}

