package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ExecutePasswordResetRequest {
    @MapperOptions(name = "password")
    private String password;
    @MapperOptions(name = "token")
    private String token;
}

