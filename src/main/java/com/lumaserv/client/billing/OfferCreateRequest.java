package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class OfferCreateRequest {
	@MapperOptions(name = "number")
	private String number;
	@MapperOptions(name = "amount")
	private float amount;
	@MapperOptions(name = "positions")
	private OfferCreateRequestPosition[] positions;
	@MapperOptions(name = "net_amount")
	private float netAmount;
	@MapperOptions(name = "state")
	private OfferState state;
	@MapperOptions(name = "customer_id")
	private int customerId;
}

