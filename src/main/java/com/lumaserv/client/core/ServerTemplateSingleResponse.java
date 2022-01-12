package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerTemplateSingleResponse {
	@MapperOptions(name = "metadata")
	private ResponseMetadata metadata;
	@MapperOptions(name = "data")
	private ServerTemplate data;
	@MapperOptions(name = "success")
	private boolean success;
	@MapperOptions(name = "messages")
	private ResponseMessages messages;
}

