package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerFirewallRuleCreateRequest {
    @MapperOptions(name = "addresses")
    private String[] addresses;
    @MapperOptions(name = "protocol")
    private ServerFirewallRuleProtocol protocol;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "disabled")
    private boolean disabled;
    @MapperOptions(name = "type")
    private ServerFirewallRuleType type;
    @MapperOptions(name = "ports")
    private String[] ports;
}

