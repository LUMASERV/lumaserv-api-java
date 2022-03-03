package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ScheduledServerActionSingleResponse {
    @MapperOptions(name = "metadata")
    private ResponseMetadata metadata;
    @MapperOptions(name = "data")
    private ScheduledServerAction data;
    @MapperOptions(name = "success")
    private boolean success;
    @MapperOptions(name = "messages")
    private ResponseMessages messages;
}
