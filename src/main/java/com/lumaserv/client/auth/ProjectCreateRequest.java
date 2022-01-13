package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ProjectCreateRequest {
    @MapperOptions(name = "customer_reference")
    private String customerReference;
    @MapperOptions(name = "title")
    private String title;
}

