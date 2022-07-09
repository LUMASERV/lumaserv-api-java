package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerPriceRangeAssignment {
    @MapperOptions(name = "user_id")
    private java.util.UUID userId;
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "range_id")
    private java.util.UUID rangeId;
}

