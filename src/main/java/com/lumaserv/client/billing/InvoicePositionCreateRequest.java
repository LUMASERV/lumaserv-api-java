package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class InvoicePositionCreateRequest {
	@MapperOptions(name = "amount")
	private float amount;
	@MapperOptions(name = "unit")
	private String unit;
	@MapperOptions(name = "price")
	private float price;
	@MapperOptions(name = "invoice_id")
	private String invoiceId;
	@MapperOptions(name = "description")
	private String description;
	@MapperOptions(name = "title")
	private String title;
	@MapperOptions(name = "vat_rate")
	private float vatRate;
	@MapperOptions(name = "group_key")
	private String groupKey;
}

