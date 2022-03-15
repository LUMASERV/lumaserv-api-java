package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class File {
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "state")
    private String state;
    @MapperOptions(name = "type")
    private String type;
    @MapperOptions(name = "object_id")
    private java.util.UUID objectId;
}

