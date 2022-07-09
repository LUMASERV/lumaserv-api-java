package com.lumaserv.client.domain;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ResponseMessage {
    @MapperOptions(name = "message")
    private String message;
    @MapperOptions(name = "key")
    private String key;
}

