package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class OfferPosition {
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
    private String interval;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "offer_id")
    private java.util.UUID offerId;
    @MapperOptions(name = "vat_rate")
    private float vatRate;
}

