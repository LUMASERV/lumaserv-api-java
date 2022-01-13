package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class S3BucketCreateRequest {
    @MapperOptions(name = "project_id")
    private String projectId;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "labels")
    private Object labels;
}

