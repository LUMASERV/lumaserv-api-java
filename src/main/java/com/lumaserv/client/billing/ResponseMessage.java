package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ResponseMessage {
	@MapperOptions(name = "message")
	private String message;
	@MapperOptions(name = "key")
	private String key;
}

