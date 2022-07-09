package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerVolumeCreateRequest {
    @MapperOptions(name = "zone_id")
    private String zoneId;
    @MapperOptions(name = "size")
    private int size;
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "class_id")
    private java.util.UUID classId;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

