package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ProjectMember {
	@MapperOptions(name = "role")
	private String role;
	@MapperOptions(name = "user_id")
	private String userId;
	@MapperOptions(name = "project_id")
	private String projectId;
}

