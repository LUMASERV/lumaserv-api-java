package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class InvoiceUpdateRequest {
    @MapperOptions(name = "paid_at")
    private String paidAt;
    @MapperOptions(name = "cancelled_at")
    private String cancelledAt;
    @MapperOptions(name = "due_at")
    private String dueAt;
    @MapperOptions(name = "state")
    private InvoiceState state;
    @MapperOptions(name = "customer_id")
    private int customerId;
}

