package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerVariantCreateRequest {
	@MapperOptions(name = "zone_ids")
	private String zoneIds;
	@MapperOptions(name = "disk")
	private int disk;
	@MapperOptions(name = "cores")
	private int cores;
	@MapperOptions(name = "memory")
	private int memory;
	@MapperOptions(name = "legacy")
	private boolean legacy;
	@MapperOptions(name = "storage_class_id")
	private String storageClassId;
	@MapperOptions(name = "title")
	private String title;
}

