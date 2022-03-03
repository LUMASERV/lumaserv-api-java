package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Project {
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "title")
    private String title;
}

