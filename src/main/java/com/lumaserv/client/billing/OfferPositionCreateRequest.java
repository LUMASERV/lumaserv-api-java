package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class OfferPositionCreateRequest {
    @MapperOptions(name = "purchasing_price")
    private float purchasingPrice;
    @MapperOptions(name = "note")
    private String note;
    @MapperOptions(name = "amount")
    private float amount;
    @MapperOptions(name = "price")
    private float price;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "interval")
    private OfferPositionInterval interval;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "offer_id")
    private String offerId;
    @MapperOptions(name = "vat_rate")
    private float vatRate;
}

