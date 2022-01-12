package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerVolume {
	@MapperOptions(name = "size")
	private int size;
	@MapperOptions(name = "project_id")
	private String projectId;
	@MapperOptions(name = "class_id")
	private String classId;
	@MapperOptions(name = "root")
	private boolean root;
	@MapperOptions(name = "created_at")
	private String createdAt;
	@MapperOptions(name = "id")
	private String id;
	@MapperOptions(name = "title")
	private String title;
	@MapperOptions(name = "server_id")
	private String serverId;
	@MapperOptions(name = "labels")
	private Object labels;
}

