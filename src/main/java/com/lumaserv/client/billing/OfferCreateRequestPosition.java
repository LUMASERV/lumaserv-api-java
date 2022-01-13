package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class OfferCreateRequestPosition {
    @MapperOptions(name = "purchasing_price")
    private String purchasingPrice;
    @MapperOptions(name = "note")
    private String note;
    @MapperOptions(name = "amount")
    private String amount;
    @MapperOptions(name = "price")
    private String price;
    @MapperOptions(name = "description")
    private String description;
    @MapperOptions(name = "interval")
    private String interval;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "offer_id")
    private String offerId;
    @MapperOptions(name = "vat_rate")
    private String vatRate;
}

