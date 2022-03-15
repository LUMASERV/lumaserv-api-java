package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class BillingPositionCreateRequest {
    @MapperOptions(name = "invoice_position_id")
    private String invoicePositionId;
    @MapperOptions(name = "amount")
    private float amount;
    @MapperOptions(name = "price")
    private float price;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "customer_id")
    private String customerId;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "available_at")
    private String availableAt;
    @MapperOptions(name = "vat_rate")
    private float vatRate;
    @MapperOptions(name = "group_key")
    private String groupKey;
}

