package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class AvailabilityZone {
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "config")
    private Object config;
}

