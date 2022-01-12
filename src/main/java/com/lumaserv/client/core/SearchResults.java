package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SearchResults {
	@MapperOptions(name = "domains")
	private Domain[] domains;
	@MapperOptions(name = "domain_handles")
	private DomainHandle[] domainHandles;
}

