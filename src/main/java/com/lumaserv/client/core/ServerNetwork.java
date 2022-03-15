package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerNetwork {
    @MapperOptions(name = "default")
    private boolean isDefault;
    @MapperOptions(name = "network_id")
    private java.util.UUID networkId;
    @MapperOptions(name = "address_v6_id")
    private java.util.UUID addressV6Id;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "external_id")
    private String externalId;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "address_v4_id")
    private java.util.UUID addressV4Id;
    @MapperOptions(name = "host_id")
    private java.util.UUID hostId;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

