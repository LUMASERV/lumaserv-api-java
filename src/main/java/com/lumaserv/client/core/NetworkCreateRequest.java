package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class NetworkCreateRequest {
	@MapperOptions(name = "zone_id")
	private String zoneId;
	@MapperOptions(name = "project_id")
	private String projectId;
	@MapperOptions(name = "tag")
	private int tag;
	@MapperOptions(name = "title")
	private String title;
	@MapperOptions(name = "type")
	private NetworkType type;
}

