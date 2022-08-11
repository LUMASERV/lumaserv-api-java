package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ProjectInviteCreateRequest {
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "email")
    private String email;
}

