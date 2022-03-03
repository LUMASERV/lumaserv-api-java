package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class InvoicePosition {
    @MapperOptions(name = "amount")
    private float amount;
    @MapperOptions(name = "unit")
    private String unit;
    @MapperOptions(name = "updated_at")
    private String updatedAt;
    @MapperOptions(name = "price")
    private float price;
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "position")
    private float position;
    @MapperOptions(name = "vat_rate")
    private float vatRate;
    @MapperOptions(name = "group_key")
    private String groupKey;
}

