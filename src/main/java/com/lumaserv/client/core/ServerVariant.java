package com.lumaserv.client.core;

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
    private String storageClassId;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "title")
    private String title;
}

