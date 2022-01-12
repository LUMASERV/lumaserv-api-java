package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Customer {
	@MapperOptions(name = "additional_address")
	private String additionalAddress;
	@MapperOptions(name = "city")
	private String city;
	@MapperOptions(name = "last_name")
	private String lastName;
	@MapperOptions(name = "billing_interval")
	private BillingInterval billingInterval;
	@MapperOptions(name = "custom_vat_rate")
	private float customVatRate;
	@MapperOptions(name = "country_code")
	private String countryCode;
	@MapperOptions(name = "invoice_shipping_type")
	private InvoiceShippingType invoiceShippingType;
	@MapperOptions(name = "balance")
	private float balance;
	@MapperOptions(name = "user_id")
	private String userId;
	@MapperOptions(name = "street")
	private String street;
	@MapperOptions(name = "company_name")
	private String companyName;
	@MapperOptions(name = "street_number")
	private String streetNumber;
	@MapperOptions(name = "credit_limit")
	private float creditLimit;
	@MapperOptions(name = "vat_id")
	private String vatId;
	@MapperOptions(name = "id")
	private int id;
	@MapperOptions(name = "postal_code")
	private String postalCode;
	@MapperOptions(name = "first_name")
	private String firstName;
	@MapperOptions(name = "email")
	private String email;
	@MapperOptions(name = "next_billing_date")
	private String nextBillingDate;
}

