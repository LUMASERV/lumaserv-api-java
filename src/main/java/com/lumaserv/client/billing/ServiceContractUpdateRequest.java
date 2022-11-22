package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServiceContractUpdateRequest {
    @MapperOptions(name = "unit")
    private String unit;
    @MapperOptions(name = "cancellation_period")
    private int cancellationPeriod;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "unit_amount")
    private float unitAmount;
    @MapperOptions(name = "customer_id")
    private java.util.UUID customerId;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "unit_price")
    private float unitPrice;
    @MapperOptions(name = "renewal_interval")
    private ServiceContractInterval renewalInterval;
    @MapperOptions(name = "accounting_period")
    private ServiceContractInterval accountingPeriod;
}

