package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerVariant {
    @MapperOptions(name = "disk")
    private int disk;
    @MapperOptions(name = "cores")
    private int cores;
    @MapperOptions(name = "memory")
    private int memory;
    @MapperOptions(name = "storage_class_id")
    private java.util.UUID storageClassId;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "title")
    private String title;
}

