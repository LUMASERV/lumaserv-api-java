package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerCreateRequest {
    @MapperOptions(name = "zone_id")
    private String zoneId;
    @MapperOptions(name = "variant_id")
    private String variantId;
    @MapperOptions(name = "ssh_keys")
    private String[] sshKeys;
    @MapperOptions(name = "project_id")
    private String projectId;
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "template_id")
    private String templateId;
    @MapperOptions(name = "networks")
    private ServerCreateRequestNetwork[] networks;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

