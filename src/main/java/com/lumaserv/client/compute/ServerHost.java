package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerHost {
    @MapperOptions(name = "zone_id")
    private java.util.UUID zoneId;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "active")
    private boolean active;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "title")
    private String title;
}

