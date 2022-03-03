package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class UserUpdateRequest {
    @MapperOptions(name = "password")
    private String password;
    @MapperOptions(name = "gender")
    private Gender gender;
    @MapperOptions(name = "last_name")
    private String lastName;
    @MapperOptions(name = "company")
    private String company;
    @MapperOptions(name = "state")
    private UserState state;
    @MapperOptions(name = "type")
    private UserType type;
    @MapperOptions(name = "customer_id")
    private int customerId;
    @MapperOptions(name = "first_name")
    private String firstName;
    @MapperOptions(name = "email")
    private String email;
}

