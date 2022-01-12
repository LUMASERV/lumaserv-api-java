package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class User {
	@MapperOptions(name = "gender")
	private String gender;
	@MapperOptions(name = "last_name")
	private String lastName;
	@MapperOptions(name = "id")
	private String id;
	@MapperOptions(name = "state")
	private String state;
	@MapperOptions(name = "customer_id")
	private int customerId;
	@MapperOptions(name = "type")
	private String type;
	@MapperOptions(name = "first_name")
	private String firstName;
	@MapperOptions(name = "email")
	private String email;
}

