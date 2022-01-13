package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DNSRecord {
    @MapperOptions(name = "data")
    private String data;
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "type")
    private String type;
    @MapperOptions(name = "ttl")
    private int ttl;
}
