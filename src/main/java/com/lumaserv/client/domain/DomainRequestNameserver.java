package com.lumaserv.client.domain;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DomainRequestNameserver {
    @MapperOptions(name = "addresses")
    private String[] addresses;
    @MapperOptions(name = "name")
    private String name;
}

