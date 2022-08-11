package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerFirewallRuleUpdateRequest {
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "disabled")
    private boolean disabled;
}

