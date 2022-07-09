package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerRestoreRequest {
    @MapperOptions(name = "backup_id")
    private java.util.UUID backupId;
}

