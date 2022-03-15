package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerFirewallCreateRequest {
    @MapperOptions(name = "project_id")
    private String projectId;
    @MapperOptions(name = "title")
    private String title;
}

