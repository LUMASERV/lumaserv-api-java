package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DomainVerificationStatus {
    @MapperOptions(name = "unverified")
    private boolean unverified;
}

