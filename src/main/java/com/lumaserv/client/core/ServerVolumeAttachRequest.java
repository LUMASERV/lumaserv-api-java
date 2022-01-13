package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerVolumeAttachRequest {
    @MapperOptions(name = "server_id")
    private String serverId;
}

