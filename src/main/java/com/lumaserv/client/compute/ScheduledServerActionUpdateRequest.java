package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ScheduledServerActionUpdateRequest {
    @MapperOptions(name = "backup_id")
    private java.util.UUID backupId;
    @MapperOptions(name = "backup_retention")
    private int backupRetention;
    @MapperOptions(name = "interval")
    private ScheduledServerActionInterval interval;
    @MapperOptions(name = "force")
    private boolean force;
    @MapperOptions(name = "type")
    private ServerActionType type;
}

