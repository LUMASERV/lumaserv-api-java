package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Domain {
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "admin_handle_code")
    private String adminHandleCode;
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "owner_handle_code")
    private String ownerHandleCode;
    @MapperOptions(name = "tech_handle_code")
    private String techHandleCode;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "zone_handle_code")
    private String zoneHandleCode;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

