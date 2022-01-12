package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SubnetCreateRequest {
	@MapperOptions(name = "network_id")
	private String networkId;
	@MapperOptions(name = "address")
	private String address;
	@MapperOptions(name = "public")
	private boolean public;
	@MapperOptions(name = "project_id")
	private String projectId;
	@MapperOptions(name = "prefix")
	private int prefix;
}

