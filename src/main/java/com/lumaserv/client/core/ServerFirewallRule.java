package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerFirewallRule {
    @MapperOptions(name = "source_addresses")
    private String[] sourceAddresses;
    @MapperOptions(name = "protocol")
    private ServerFirewallRuleProtocol protocol;
    @MapperOptions(name = "destination_ports")
    private String[] destinationPorts;
    @MapperOptions(name = "destination_addresses")
    private String[] destinationAddresses;
    @MapperOptions(name = "applied")
    private boolean applied;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "source_ports")
    private String[] sourcePorts;
    @MapperOptions(name = "type")
    private ServerFirewallRuleType type;
}

