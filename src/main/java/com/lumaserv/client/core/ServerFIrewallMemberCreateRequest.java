package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerFIrewallMemberCreateRequest {
    @MapperOptions(name = "label_value")
    private String labelValue;
    @MapperOptions(name = "type")
    private ServerFirewallMemberType type;
    @MapperOptions(name = "server_id")
    private java.util.UUID serverId;
    @MapperOptions(name = "label_name")
    private String labelName;
}

