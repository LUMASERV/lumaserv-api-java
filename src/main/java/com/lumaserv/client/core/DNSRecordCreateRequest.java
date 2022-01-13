package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DNSRecordCreateRequest {
    @MapperOptions(name = "data")
    private String data;
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "type")
    private String type;
    @MapperOptions(name = "ttl")
    private int ttl;
}

