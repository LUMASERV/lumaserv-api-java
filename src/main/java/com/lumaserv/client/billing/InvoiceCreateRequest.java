package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class InvoiceCreateRequest {
    @MapperOptions(name = "paid_at")
    private String paidAt;
    @MapperOptions(name = "cancelled_at")
    private String cancelledAt;
    @MapperOptions(name = "due_at")
    private String dueAt;
    @MapperOptions(name = "positions")
    private InvoiceCreateRequestPosition[] positions;
    @MapperOptions(name = "state")
    private InvoiceState state;
    @MapperOptions(name = "customer_id")
    private int customerId;
}

