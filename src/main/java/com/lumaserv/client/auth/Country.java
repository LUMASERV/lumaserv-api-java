package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Country {
    @MapperOptions(name = "code")
    private String code;
    @MapperOptions(name = "title")
    private String title;
}

