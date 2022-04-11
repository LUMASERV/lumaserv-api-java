package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class InvoiceDetailed {
    @MapperOptions(name = "paid_at")
    private String paidAt;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "due_at")
    private String dueAt;
    @MapperOptions(name = "positions")
    private Position[] positions;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "state")
    private InvoiceState state;
    @MapperOptions(name = "customer_id")
    private java.util.UUID customerId;
}

