package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Server {
    @MapperOptions(name = "zone_id")
    private String zoneId;
    @MapperOptions(name = "addresses")
    private Address[] addresses;
    @MapperOptions(name = "variant_id")
    private String variantId;
    @MapperOptions(name = "project_id")
    private String projectId;
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "media_id")
    private String mediaId;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "template_id")
    private String templateId;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "state")
    private String state;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

