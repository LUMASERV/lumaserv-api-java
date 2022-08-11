package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerHostUpdateRequest {
    @MapperOptions(name = "active")
    private boolean active;
    @MapperOptions(name = "title")
    private String title;
}

