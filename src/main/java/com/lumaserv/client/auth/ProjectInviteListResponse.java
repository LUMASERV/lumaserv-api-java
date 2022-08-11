package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ProjectInviteListResponse {
    @MapperOptions(name = "metadata")
    private ResponseMetadata metadata;
    @MapperOptions(name = "pagination")
    private ResponsePagination pagination;
    @MapperOptions(name = "data")
    private ProjectInvite[] data;
    @MapperOptions(name = "success")
    private boolean success;
    @MapperOptions(name = "messages")
    private ResponseMessages messages;
}

