package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerVolumeListResponse {
	@MapperOptions(name = "metadata")
	private ResponseMetadata metadata;
	@MapperOptions(name = "pagination")
	private ResponsePagination pagination;
	@MapperOptions(name = "data")
	private ServerVolume[] data;
	@MapperOptions(name = "success")
	private boolean success;
	@MapperOptions(name = "messages")
	private ResponseMessages messages;
}

