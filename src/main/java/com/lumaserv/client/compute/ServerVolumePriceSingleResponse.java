package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerVolumePriceSingleResponse {
    @MapperOptions(name = "metadata")
    private ResponseMetadata metadata;
    @MapperOptions(name = "data")
    private ServerVolumePrice data;
    @MapperOptions(name = "success")
    private boolean success;
    @MapperOptions(name = "messages")
    private ResponseMessages messages;
}
