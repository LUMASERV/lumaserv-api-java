package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SSHKey {
	@MapperOptions(name = "public_key")
	private String publicKey;
	@MapperOptions(name = "project_id")
	private String projectId;
	@MapperOptions(name = "created_at")
	private String createdAt;
	@MapperOptions(name = "id")
	private String id;
	@MapperOptions(name = "title")
	private String title;
	@MapperOptions(name = "labels")
	private Object labels;
}

