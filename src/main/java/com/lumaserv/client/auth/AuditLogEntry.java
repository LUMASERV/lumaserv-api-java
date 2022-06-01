package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class AuditLogEntry {
    @MapperOptions(name = "date")
    private String date;
    @MapperOptions(name = "token_id")
    private java.util.UUID tokenId;
    @MapperOptions(name = "user_id")
    private java.util.UUID userId;
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "object_type")
    private ObjectType objectType;
    @MapperOptions(name = "context")
    private AbstractObject context;
    @MapperOptions(name = "action")
    private String action;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "ip_address")
    private String ipAddress;
    @MapperOptions(name = "object_id")
    private java.util.UUID objectId;
}

