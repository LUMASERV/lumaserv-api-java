package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class TokenValidationInfo {
    @MapperOptions(name = "project_memberships")
    private ProjectMember[] projectMemberships;
    @MapperOptions(name = "user")
    private User user;
    @MapperOptions(name = "token")
    private Token token;
}

