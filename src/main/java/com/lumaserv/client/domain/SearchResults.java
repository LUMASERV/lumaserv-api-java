package com.lumaserv.client.domain;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SearchResults {
    @MapperOptions(name = "domains")
    private Domain[] domains;
    @MapperOptions(name = "domain_handles")
    private DomainHandle[] domainHandles;
}

