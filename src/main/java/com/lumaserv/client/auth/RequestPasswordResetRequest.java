package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class RequestPasswordResetRequest {
    @MapperOptions(name = "username")
    private String username;
}

