package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerFirewallRuleCreateRequest {
    @MapperOptions(name = "source_addresses")
    private String[] sourceAddresses;
    @MapperOptions(name = "protocol")
    private ServerFirewallRuleProtocol protocol;
    @MapperOptions(name = "destination_ports")
    private String[] destinationPorts;
    @MapperOptions(name = "destination_addresses")
    private String[] destinationAddresses;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "source_ports")
    private String[] sourcePorts;
    @MapperOptions(name = "type")
    private ServerFirewallRuleType type;
}

