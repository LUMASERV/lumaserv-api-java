package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerFirewallRule {
    @MapperOptions(name = "addresses")
    private String[] addresses;
    @MapperOptions(name = "protocol")
    private ServerFirewallRuleProtocol protocol;
    @MapperOptions(name = "applied")
    private boolean applied;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "type")
    private ServerFirewallRuleType type;
    @MapperOptions(name = "ports")
    private String[] ports;
}

