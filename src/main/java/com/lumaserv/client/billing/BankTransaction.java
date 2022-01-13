package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class BankTransaction {
    @MapperOptions(name = "bank_account_id")
    private String bankAccountId;
    @MapperOptions(name = "bank_code")
    private String bankCode;
    @MapperOptions(name = "account_number")
    private String accountNumber;
    @MapperOptions(name = "amount")
    private String amount;
    @MapperOptions(name = "booking_date")
    private String bookingDate;
    @MapperOptions(name = "booking_text")
    private String bookingText;
    @MapperOptions(name = "type")
    private String type;
    @MapperOptions(name = "debit_id")
    private String debitId;
    @MapperOptions(name = "reference")
    private String reference;
    @MapperOptions(name = "depositor")
    private String depositor;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "extended_reference")
    private String extendedReference;
    @MapperOptions(name = "value_date")
    private String valueDate;
}

