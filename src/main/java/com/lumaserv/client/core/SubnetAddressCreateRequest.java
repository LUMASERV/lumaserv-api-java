package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SubnetAddressCreateRequest {
	@MapperOptions(name = "address")
	private String address;
}

