package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Offer {
    @MapperOptions(name = "number")
    private String number;
    @MapperOptions(name = "amount")
    private float amount;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "net_amount")
    private float netAmount;
    @MapperOptions(name = "state")
    private OfferState state;
    @MapperOptions(name = "customer_id")
    private int customerId;
}

