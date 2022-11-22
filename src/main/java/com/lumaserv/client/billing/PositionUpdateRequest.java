package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PositionUpdateRequest {
    @MapperOptions(name = "amount")
    private float amount;
    @MapperOptions(name = "unit")
    private String unit;
    @MapperOptions(name = "price")
    private float price;
    @MapperOptions(name = "period_from")
    private String periodFrom;
    @MapperOptions(name = "name")
    private String name;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "period_to")
    private String periodTo;
    @MapperOptions(name = "vat_rate")
    private float vatRate;
    @MapperOptions(name = "group_key")
    private String groupKey;
}

