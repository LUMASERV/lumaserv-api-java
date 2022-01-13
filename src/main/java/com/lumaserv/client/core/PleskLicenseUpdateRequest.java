package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PleskLicenseUpdateRequest {
    @MapperOptions(name = "address")
    private String address;
    @MapperOptions(name = "labels")
    private Object labels;
}

