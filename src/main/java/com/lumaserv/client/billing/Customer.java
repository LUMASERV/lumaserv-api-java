package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Customer {
    @MapperOptions(name = "balance")
    private float balance;
    @MapperOptions(name = "user_id")
    private String userId;
    @MapperOptions(name = "company_name")
    private String companyName;
    @MapperOptions(name = "credit_limit")
    private float creditLimit;
    @MapperOptions(name = "last_name")
    private String lastName;
    @MapperOptions(name = "billing_interval")
    private BillingInterval billingInterval;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "first_name")
    private String firstName;
    @MapperOptions(name = "next_billing_date")
    private String nextBillingDate;
}

