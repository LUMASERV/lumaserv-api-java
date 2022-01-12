package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class EmptyResponse {
	@MapperOptions(name = "metadata")
	private ResponseMetadata metadata;
	@MapperOptions(name = "success")
	private boolean success;
	@MapperOptions(name = "messages")
	private ResponseMessages messages;
}

