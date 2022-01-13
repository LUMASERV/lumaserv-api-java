package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Token {
    @MapperOptions(name = "user_id")
    private String userId;
    @MapperOptions(name = "scope")
    private TokenScope scope;
    @MapperOptions(name = "validUntil")
    private String validUntil;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "type")
    private String type;
    @MapperOptions(name = "token")
    private String token;
}

