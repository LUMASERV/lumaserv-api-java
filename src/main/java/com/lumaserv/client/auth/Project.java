package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Project {
	@MapperOptions(name = "id")
	private String id;
	@MapperOptions(name = "detail")
	private Object detail;
	@MapperOptions(name = "title")
	private String title;
}

