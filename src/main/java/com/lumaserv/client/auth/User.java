package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class User {
    @MapperOptions(name = "gender")
    private Gender gender;
    @MapperOptions(name = "last_name")
    private String lastName;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "state")
    private UserState state;
    @MapperOptions(name = "customer_id")
    private String customerId;
    @MapperOptions(name = "type")
    private UserType type;
    @MapperOptions(name = "first_name")
    private String firstName;
    @MapperOptions(name = "email")
    private String email;
}

