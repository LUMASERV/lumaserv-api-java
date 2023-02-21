package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerVolumePrice {
    @MapperOptions(name = "price")
    private float price;
    @MapperOptions(name = "class_id")
    private java.util.UUID classId;
}

