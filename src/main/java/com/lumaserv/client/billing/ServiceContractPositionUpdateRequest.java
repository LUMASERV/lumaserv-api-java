package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServiceContractPositionUpdateRequest {
    @MapperOptions(name = "amount")
    private float amount;
    @MapperOptions(name = "price")
    private float price;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "vat_rate")
    private float vatRate;
}

