package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class S3AccessGrant {
    @MapperOptions(name = "bucket_id")
    private java.util.UUID bucketId;
    @MapperOptions(name = "path")
    private String path;
    @MapperOptions(name = "role")
    private String role;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

