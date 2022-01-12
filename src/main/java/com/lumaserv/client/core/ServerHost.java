package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerHost {
	@MapperOptions(name = "zone_id")
	private String zoneId;
	@MapperOptions(name = "created_at")
	private String createdAt;
	@MapperOptions(name = "id")
	private String id;
	@MapperOptions(name = "title")
	private String title;
}

