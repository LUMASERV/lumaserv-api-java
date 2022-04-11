package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerAction {
    @MapperOptions(name = "progress")
    private float progress;
    @MapperOptions(name = "started_at")
    private String startedAt;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "state")
    private ServerActionState state;
    @MapperOptions(name = "type")
    private ServerActionType type;
    @MapperOptions(name = "cancellable")
    private boolean cancellable;
    @MapperOptions(name = "ended_at")
    private String endedAt;
}

