package com.lumaserv.client.domain;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

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

