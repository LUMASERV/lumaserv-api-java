package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class NetworkUpdateRequest {
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}
