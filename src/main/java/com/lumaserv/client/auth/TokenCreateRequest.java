package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class TokenCreateRequest {
	@MapperOptions(name = "user_id")
	private String userId;
	@MapperOptions(name = "scope")
	private TokenScope scope;
	@MapperOptions(name = "title")
	private String title;
}

