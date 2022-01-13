package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PaymentReminderUpdateRequest {
    @MapperOptions(name = "date")
    private String date;
    @MapperOptions(name = "stage")
    private PaymentReminderStage stage;
    @MapperOptions(name = "due_date")
    private String dueDate;
    @MapperOptions(name = "state")
    private PaymentReminderState state;
}

