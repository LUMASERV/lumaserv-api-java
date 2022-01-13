package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PleskLicense {
    @MapperOptions(name = "license")
    private String license;
    @MapperOptions(name = "project_id")
    private String projectId;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "key")
    private String key;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

