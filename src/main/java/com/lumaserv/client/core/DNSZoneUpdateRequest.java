package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DNSZoneUpdateRequest {
    @MapperOptions(name = "hostmaster")
    private String hostmaster;
    @MapperOptions(name = "ns2")
    private String ns2;
    @MapperOptions(name = "ns1")
    private String ns1;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

