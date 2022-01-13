package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Subnet {
    @MapperOptions(name = "network_id")
    private String networkId;
    @MapperOptions(name = "address")
    private String address;
    @MapperOptions(name = "prefix")
    private int prefix;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "id")
    private String id;
}

