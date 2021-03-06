package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerTemplateCreateRequest {
    @MapperOptions(name = "root_slot")
    private String rootSlot;
    @MapperOptions(name = "zones")
    private AbstractObject zones;
    @MapperOptions(name = "title")
    private String title;
}

