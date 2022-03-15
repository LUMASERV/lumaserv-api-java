package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerBackup {
    @MapperOptions(name = "size")
    private float size;
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "action_id")
    private java.util.UUID actionId;
    @MapperOptions(name = "scheduled")
    private boolean scheduled;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "state")
    private ServerBackupState state;
    @MapperOptions(name = "title")
    private String title;
}

