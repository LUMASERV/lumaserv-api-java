package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerVNC {
    @MapperOptions(name = "password")
    private String password;
    @MapperOptions(name = "port")
    private int port;
    @MapperOptions(name = "host")
    private String host;
}

