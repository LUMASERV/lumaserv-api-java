package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class BillingPositionUpdateRequest {
    @MapperOptions(name = "invoice_position_id")
    private java.util.UUID invoicePositionId;
    @MapperOptions(name = "amount")
    private float amount;
    @MapperOptions(name = "unit")
    private String unit;
    @MapperOptions(name = "price")
    private float price;
    @MapperOptions(name = "draft")
    private boolean draft;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "available_at")
    private String availableAt;
    @MapperOptions(name = "vat_rate")
    private float vatRate;
    @MapperOptions(name = "group_key")
    private String groupKey;
}

