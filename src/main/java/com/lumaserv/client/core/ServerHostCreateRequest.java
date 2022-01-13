package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerHostCreateRequest {
    @MapperOptions(name = "zone_id")
    private String zoneId;
    @MapperOptions(name = "external_id")
    private String externalId;
    @MapperOptions(name = "title")
    private String title;
}

