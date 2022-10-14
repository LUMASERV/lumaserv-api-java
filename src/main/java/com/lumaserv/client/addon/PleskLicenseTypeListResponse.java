package com.lumaserv.client.addon;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PleskLicenseTypeListResponse {
    @MapperOptions(name = "metadata")
    private ResponseMessages metadata;
    @MapperOptions(name = "pagination")
    private ResponsePagination pagination;
    @MapperOptions(name = "data")
    private PleskLicenseType[] data;
    @MapperOptions(name = "success")
    private boolean success;
    @MapperOptions(name = "messages")
    private ResponseMessages messages;
}

