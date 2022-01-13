package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class CustomerTransaction {
    @MapperOptions(name = "date")
    private String date;
    @MapperOptions(name = "amount")
    private float amount;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "customer_id")
    private int customerId;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "type")
    private CustomerTransactionType type;
    @MapperOptions(name = "object_id")
    private String objectId;
}

