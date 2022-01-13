package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Network {
    @MapperOptions(name = "zone_id")
    private String zoneId;
    @MapperOptions(name = "project_id")
    private String projectId;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "tag")
    private int tag;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "type")
    private NetworkType type;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

