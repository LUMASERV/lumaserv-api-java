package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerGraphEntry {
    @MapperOptions(name = "disk_read")
    private int diskRead;
    @MapperOptions(name = "memory")
    private float memory;
    @MapperOptions(name = "network_ingress")
    private float networkIngress;
    @MapperOptions(name = "network_egress")
    private float networkEgress;
    @MapperOptions(name = "memory_usage")
    private float memoryUsage;
    @MapperOptions(name = "time")
    private int time;
    @MapperOptions(name = "cpu_usage")
    private float cpuUsage;
    @MapperOptions(name = "disk_write")
    private int diskWrite;
}

