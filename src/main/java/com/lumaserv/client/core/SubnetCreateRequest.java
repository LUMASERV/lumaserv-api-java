package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SubnetCreateRequest {
    @MapperOptions(name = "shared")
    private boolean shared;
    @MapperOptions(name = "network_id")
    private java.util.UUID networkId;
    @MapperOptions(name = "address")
    private String address;
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "prefix")
    private int prefix;
    @MapperOptions(name = "range")
    private String range;
}

