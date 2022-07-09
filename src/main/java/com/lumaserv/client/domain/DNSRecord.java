package com.lumaserv.client.domain;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DNSRecord {
    @MapperOptions(name = "data")
    private String data;
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "type")
    private String type;
    @MapperOptions(name = "ttl")
    private int ttl;
}

