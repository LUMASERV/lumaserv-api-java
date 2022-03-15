package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PleskLicenseType {
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "title")
    private String title;
}

