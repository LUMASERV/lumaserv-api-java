package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerNetworkCreateRequest {
	@MapperOptions(name = "network_id")
	private String networkId;
}

