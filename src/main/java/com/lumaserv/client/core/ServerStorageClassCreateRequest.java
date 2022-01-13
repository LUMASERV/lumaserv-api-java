package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerStorageClassCreateRequest {
    @MapperOptions(name = "replication")
    private int replication;
    @MapperOptions(name = "storage_ids")
    private String[] storageIds;
    @MapperOptions(name = "title")
    private String title;
}

