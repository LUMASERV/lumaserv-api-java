package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SSHKey {
    @MapperOptions(name = "public_key")
    private String publicKey;
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}
