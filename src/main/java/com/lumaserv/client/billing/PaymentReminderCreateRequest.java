package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PaymentReminderCreateRequest {
	@MapperOptions(name = "date")
	private String date;
	@MapperOptions(name = "stage")
	private String stage;
	@MapperOptions(name = "due_date")
	private String dueDate;
	@MapperOptions(name = "invoice_id")
	private String invoiceId;
	@MapperOptions(name = "state")
	private String state;
	@MapperOptions(name = "customer_id")
	private int customerId;
}

