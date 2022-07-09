package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerMediaCreateRequest {
    @MapperOptions(name = "zone_id")
    private java.util.UUID zoneId;
    @MapperOptions(name = "external_id")
    private String externalId;
    @MapperOptions(name = "title")
    private String title;
}

