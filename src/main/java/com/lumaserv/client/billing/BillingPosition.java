package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class BillingPosition {
	@MapperOptions(name = "invoice_position_id")
	private String invoicePositionId;
	@MapperOptions(name = "amount")
	private String amount;
	@MapperOptions(name = "price")
	private String price;
	@MapperOptions(name = "description")
	private String description;
	@MapperOptions(name = "id")
	private String id;
	@MapperOptions(name = "customer_id")
	private String customerId;
	@MapperOptions(name = "title")
	private String title;
	@MapperOptions(name = "available_at")
	private String availableAt;
	@MapperOptions(name = "vat_rate")
	private String vatRate;
	@MapperOptions(name = "group_key")
	private String groupKey;
}

