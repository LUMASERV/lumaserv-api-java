package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerStatus {
    @MapperOptions(name = "memory")
    private int memory;
    @MapperOptions(name = "online")
    private boolean online;
    @MapperOptions(name = "memory_usage")
    private float memoryUsage;
    @MapperOptions(name = "cpu_usage")
    private float cpuUsage;
    @MapperOptions(name = "uptime")
    private int uptime;
}

