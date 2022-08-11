package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ProjectInviteSingleResponse {
    @MapperOptions(name = "metadata")
    private String metadata;
    @MapperOptions(name = "data")
    private ProjectInvite data;
    @MapperOptions(name = "success")
    private boolean success;
    @MapperOptions(name = "messages")
    private ResponseMessages messages;
}

