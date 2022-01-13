package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DomainRequestNameserver {
    @MapperOptions(name = "addresses")
    private String[] addresses;
    @MapperOptions(name = "name")
    private String name;
}

