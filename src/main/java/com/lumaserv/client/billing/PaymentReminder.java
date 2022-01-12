package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PaymentReminder {
	@MapperOptions(name = "date")
	private String date;
	@MapperOptions(name = "stage")
	private PaymentReminderStage stage;
	@MapperOptions(name = "due_date")
	private String dueDate;
	@MapperOptions(name = "invoice_id")
	private String invoiceId;
	@MapperOptions(name = "id")
	private String id;
	@MapperOptions(name = "state")
	private PaymentReminderState state;
	@MapperOptions(name = "customer_id")
	private int customerId;
}

