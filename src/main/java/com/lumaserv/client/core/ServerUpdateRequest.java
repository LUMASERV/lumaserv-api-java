package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerUpdateRequest {
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

