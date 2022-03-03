package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ScheduledServerActionCreateRequest {
    @MapperOptions(name = "backup_id")
    private String backupId;
    @MapperOptions(name = "interval")
    private ScheduledServerActionInterval interval;
    @MapperOptions(name = "execute_at")
    private String executeAt;
    @MapperOptions(name = "type")
    private ServerActionType type;
}

