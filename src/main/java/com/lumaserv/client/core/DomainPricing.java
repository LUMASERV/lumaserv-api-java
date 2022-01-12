package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DomainPricing {
	@MapperOptions(name = "restore")
	private float restore;
	@MapperOptions(name = "create")
	private float create;
	@MapperOptions(name = "renew")
	private float renew;
	@MapperOptions(name = "tld")
	private String tld;
}

