package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ProjectInvite {
    @MapperOptions(name = "valid_until")
    private String validUntil;
    @MapperOptions(name = "project_id")
    private String projectId;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "project_title")
    private String projectTitle;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "email")
    private String email;
}

