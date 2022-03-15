package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PaymentReminder {
    @MapperOptions(name = "date")
    private String date;
    @MapperOptions(name = "stage")
    private PaymentReminderStage stage;
    @MapperOptions(name = "due_date")
    private String dueDate;
    @MapperOptions(name = "invoice_id")
    private java.util.UUID invoiceId;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "state")
    private PaymentReminderState state;
    @MapperOptions(name = "customer_id")
    private java.util.UUID customerId;
}

