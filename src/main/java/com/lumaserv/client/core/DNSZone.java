package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DNSZone {
    @MapperOptions(name = "hostmaster")
    private String hostmaster;
    @MapperOptions(name = "project_id")
    private String projectId;
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "type")
    private String type;
    @MapperOptions(name = "ns2")
    private String ns2;
    @MapperOptions(name = "ns1")
    private String ns1;
    @MapperOptions(name = "labels")
    private Object labels;
}

