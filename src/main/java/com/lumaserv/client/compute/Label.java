package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Label {
    @MapperOptions(name = "object_type")
    private ObjectType objectType;
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "value")
    private String value;
    @MapperOptions(name = "object_id")
    private java.util.UUID objectId;
}

