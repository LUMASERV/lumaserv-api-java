package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class TokenCreateRequest {
    @MapperOptions(name = "user_id")
    private java.util.UUID userId;
    @MapperOptions(name = "scope")
    private TokenScope scope;
    @MapperOptions(name = "title")
    private String title;
}

