package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class InvoiceCreateRequestPosition {
    @MapperOptions(name = "amount")
    private float amount;
    @MapperOptions(name = "unit")
    private String unit;
    @MapperOptions(name = "price")
    private float price;
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "vat_rate")
    private float vatRate;
    @MapperOptions(name = "group")
    private String group;
}

