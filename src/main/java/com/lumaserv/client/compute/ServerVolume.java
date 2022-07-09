package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerVolume {
    @MapperOptions(name = "zone_id")
    private java.util.UUID zoneId;
    @MapperOptions(name = "size")
    private int size;
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "storage_id")
    private java.util.UUID storageId;
    @MapperOptions(name = "class_id")
    private java.util.UUID classId;
    @MapperOptions(name = "root")
    private boolean root;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "server_id")
    private java.util.UUID serverId;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

