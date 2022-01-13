package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class OfferUpdateRequest {
    @MapperOptions(name = "amount")
    private float amount;
    @MapperOptions(name = "net_amount")
    private float netAmount;
    @MapperOptions(name = "state")
    private OfferState state;
    @MapperOptions(name = "customer_id")
    private int customerId;
}

