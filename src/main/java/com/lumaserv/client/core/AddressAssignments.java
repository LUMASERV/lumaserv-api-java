package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class AddressAssignments {
    @MapperOptions(name = "assigned_type")
    private ObjectType assignedType;
    @MapperOptions(name = "assigned_id")
    private java.util.UUID assignedId;
}

