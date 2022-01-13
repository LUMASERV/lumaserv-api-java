package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class BankAccount {
    @MapperOptions(name = "bank_code")
    private String bankCode;
    @MapperOptions(name = "bank_account_number")
    private String bankAccountNumber;
    @MapperOptions(name = "bank_port")
    private int bankPort;
    @MapperOptions(name = "bank_url")
    private String bankUrl;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "title")
    private String title;
    @MapperOptions(name = "username")
    private String username;
}

