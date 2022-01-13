package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DomainAuthinfo {
    @MapperOptions(name = "valid_until")
    private String validUntil;
    @MapperOptions(name = "authinfo")
    private String authinfo;
}

