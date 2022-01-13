package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerAction {
    @MapperOptions(name = "started_at")
    private String startedAt;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "state")
    private String state;
    @MapperOptions(name = "type")
    private String type;
    @MapperOptions(name = "cancellable")
    private boolean cancellable;
    @MapperOptions(name = "ended_at")
    private String endedAt;
}

