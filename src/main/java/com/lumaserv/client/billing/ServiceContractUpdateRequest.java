package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServiceContractUpdateRequest {
    @MapperOptions(name = "cancellation_period")
    private int cancellationPeriod;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "runtime")
    private ServiceContractInterval runtime;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "accounting_period")
    private ServiceContractInterval accountingPeriod;
}

