package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerFirewallMember {
    @MapperOptions(name = "label_value")
    private String labelValue;
    @MapperOptions(name = "applied")
    private boolean applied;
    @MapperOptions(name = "children")
    private ServerFirewallMember[] children;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "type")
    private ServerFirewallMemberType type;
    @MapperOptions(name = "server_id")
    private java.util.UUID serverId;
    @MapperOptions(name = "label_name")
    private String labelName;
}

