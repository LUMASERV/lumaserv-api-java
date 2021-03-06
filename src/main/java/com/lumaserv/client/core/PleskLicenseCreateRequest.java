package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PleskLicenseCreateRequest {
    @MapperOptions(name = "address")
    private String address;
    @MapperOptions(name = "project_id")
    private String projectId;
    @MapperOptions(name = "type_id")
    private String typeId;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

