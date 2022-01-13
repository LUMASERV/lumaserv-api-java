package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServiceContractCreateRequest {
    @MapperOptions(name = "cancellation_period")
    private int cancellationPeriod;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "runtime")
    private ServiceContractInterval runtime;
    @MapperOptions(name = "positions")
    private ServiceContractCreateRequestPosition[] positions;
    @MapperOptions(name = "customer_id")
    private int customerId;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "accounting_period")
    private ServiceContractInterval accountingPeriod;
}

