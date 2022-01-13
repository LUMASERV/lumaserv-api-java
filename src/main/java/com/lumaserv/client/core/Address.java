package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Address {
    @MapperOptions(name = "address")
    private String address;
    @MapperOptions(name = "project_id")
    private String projectId;
    @MapperOptions(name = "subnet_id")
    private String subnetId;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "id")
    private String id;
}

