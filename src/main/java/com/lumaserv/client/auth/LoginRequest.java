package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class LoginRequest {
    @MapperOptions(name = "password")
    private String password;
    @MapperOptions(name = "username")
    private String username;
}

