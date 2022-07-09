package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerFirewallCreateRequest {
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "title")
    private String title;
}

