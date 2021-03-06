package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ScheduledServerAction {
    @MapperOptions(name = "backup_id")
    private String backupId;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "interval")
    private ScheduledServerActionInterval interval;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "execute_at")
    private String executeAt;
    @MapperOptions(name = "server_id")
    private String serverId;
    @MapperOptions(name = "type")
    private ServerActionType type;
}

