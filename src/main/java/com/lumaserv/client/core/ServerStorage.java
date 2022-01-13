package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerStorage {
    @MapperOptions(name = "zone_id")
    private String zoneId;
    @MapperOptions(name = "external_id")
    private String externalId;
    @MapperOptions(name = "id")
    private String id;
}

