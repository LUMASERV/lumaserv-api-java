package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerVariantPriceUpdateRequest {
    @MapperOptions(name = "price")
    private float price;
    @MapperOptions(name = "offline_price")
    private float offlinePrice;
}

