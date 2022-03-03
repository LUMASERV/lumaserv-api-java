package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerResizeRequest {
    @MapperOptions(name = "variant_id")
    private String variantId;
    @MapperOptions(name = "resize_disk")
    private boolean resizeDisk;
}

