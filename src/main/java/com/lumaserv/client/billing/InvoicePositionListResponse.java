package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class InvoicePositionListResponse {
	@MapperOptions(name = "metadata")
	private ResponseMetadata metadata;
	@MapperOptions(name = "pagination")
	private ResponsePagination pagination;
	@MapperOptions(name = "data")
	private InvoicePosition[] data;
	@MapperOptions(name = "success")
	private boolean success;
	@MapperOptions(name = "messages")
	private ResponseMessages messages;
}

