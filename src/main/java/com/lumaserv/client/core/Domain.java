package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Domain {
    @MapperOptions(name = "registered_at")
    private String registeredAt;
    @MapperOptions(name = "admin_handle_code")
    private String adminHandleCode;
    @MapperOptions(name = "tech_handle_code")
    private String techHandleCode;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "suspended_until")
    private String suspendedUntil;
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "owner_handle_code")
    private String ownerHandleCode;
    @MapperOptions(name = "expire_at")
    private String expireAt;
    @MapperOptions(name = "zone_handle_code")
    private String zoneHandleCode;
    @MapperOptions(name = "status")
    private DomainStatus status;
    @MapperOptions(name = "suspended_at")
    private String suspendedAt;
}

