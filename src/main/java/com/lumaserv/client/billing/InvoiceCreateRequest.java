package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class InvoiceCreateRequest {
    @MapperOptions(name = "due_at")
    private String dueAt;
    @MapperOptions(name = "positions")
    private InvoiceCreateRequestPosition[] positions;
    @MapperOptions(name = "customer_id")
    private int customerId;
}

