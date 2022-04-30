package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ProjectMemberCreateRequest {
    @MapperOptions(name = "role")
    private String role;
    @MapperOptions(name = "user_id")
    private java.util.UUID userId;
}

