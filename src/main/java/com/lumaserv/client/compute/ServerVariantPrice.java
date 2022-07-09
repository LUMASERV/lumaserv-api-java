package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServerVariantPrice {
    @MapperOptions(name = "variant_id")
    private java.util.UUID variantId;
    @MapperOptions(name = "price")
    private float price;
    @MapperOptions(name = "offline_price")
    private float offlinePrice;
}

