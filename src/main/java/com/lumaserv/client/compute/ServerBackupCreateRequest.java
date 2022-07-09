package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerBackupCreateRequest {
    @MapperOptions(name = "server_id")
    private java.util.UUID serverId;
    @MapperOptions(name = "title")
    private String title;
}

