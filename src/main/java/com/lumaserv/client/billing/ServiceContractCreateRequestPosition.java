package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ServiceContractCreateRequestPosition {
	@MapperOptions(name = "amount")
	private float amount;
	@MapperOptions(name = "price")
	private float price;
	@MapperOptions(name = "description")
	private String description;
	@MapperOptions(name = "title")
	private String title;
	@MapperOptions(name = "vat_rate")
	private float vatRate;
}

