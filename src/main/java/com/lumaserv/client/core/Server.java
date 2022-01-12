package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Server {
	@MapperOptions(name = "variant_id")
	private int variantId;
	@MapperOptions(name = "project_id")
	private String projectId;
	@MapperOptions(name = "name")
	private String name;
	@MapperOptions(name = "media_id")
	private String mediaId;
	@MapperOptions(name = "created_at")
	private String createdAt;
	@MapperOptions(name = "legacy_id")
	private int legacyId;
	@MapperOptions(name = "template_id")
	private String templateId;
	@MapperOptions(name = "id")
	private String id;
	@MapperOptions(name = "labels")
	private Object labels;
}

