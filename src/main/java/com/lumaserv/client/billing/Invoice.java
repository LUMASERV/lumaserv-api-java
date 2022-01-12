package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Invoice {
	@MapperOptions(name = "paid_at")
	private String paidAt;
	@MapperOptions(name = "cancelled_at")
	private String cancelledAt;
	@MapperOptions(name = "number")
	private String number;
	@MapperOptions(name = "due_at")
	private String dueAt;
	@MapperOptions(name = "id")
	private String id;
	@MapperOptions(name = "state")
	private InvoiceState state;
	@MapperOptions(name = "net_amount")
	private float netAmount;
	@MapperOptions(name = "customer_id")
	private int customerId;
}

