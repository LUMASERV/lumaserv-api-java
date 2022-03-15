package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Server {
    @MapperOptions(name = "zone_id")
    private java.util.UUID zoneId;
    @MapperOptions(name = "addresses")
    private Address[] addresses;
    @MapperOptions(name = "variant_id")
    private java.util.UUID variantId;
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "media_id")
    private java.util.UUID mediaId;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "template_id")
    private java.util.UUID templateId;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "state")
    private String state;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

