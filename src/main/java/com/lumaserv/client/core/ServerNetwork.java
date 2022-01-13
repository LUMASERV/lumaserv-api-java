package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerNetwork {
    @MapperOptions(name = "default")
    private boolean default;
    @MapperOptions(name = "network_id")
    private String networkId;
    @MapperOptions(name = "address_v6_id")
    private String addressV6Id;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "external_id")
    private String externalId;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "address_v4_id")
    private String addressV4Id;
    @MapperOptions(name = "host_id")
    private String hostId;
    @MapperOptions(name = "labels")
    private Object labels;
}

