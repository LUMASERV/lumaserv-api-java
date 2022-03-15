package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class OnlinePayment {
    @MapperOptions(name = "amount")
    private float amount;
    @MapperOptions(name = "provider")
    private String provider;
    @MapperOptions(name = "external_id")
    private String externalId;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "state")
    private String state;
    @MapperOptions(name = "customer_id")
    private String customerId;
}

