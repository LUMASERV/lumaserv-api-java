package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PleskLicenseUpdateRequest {
    @MapperOptions(name = "address")
    private String address;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

