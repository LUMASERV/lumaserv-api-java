package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DomainUpdateRequest {
	@MapperOptions(name = "admin_handle_code")
	private String adminHandleCode;
	@MapperOptions(name = "owner_handle_code")
	private String ownerHandleCode;
	@MapperOptions(name = "tech_handle_code")
	private String techHandleCode;
	@MapperOptions(name = "nameserver")
	private DomainRequestNameserver[] nameserver;
	@MapperOptions(name = "zone_handle_code")
	private String zoneHandleCode;
	@MapperOptions(name = "labels")
	private Object labels;
}

