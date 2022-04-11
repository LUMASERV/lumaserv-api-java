package com.lumaserv.client.billing;

import org.javawebstack.httpclient.HTTPClient;

public class BillingClient extends HTTPClient {
    public BillingClient(String apiKey, String baseUrl) {
        bearer(apiKey);
        setBaseUrl(baseUrl);
    }

    public BillingClient(String apiKey) {
        this(apiKey, "https://billing.lumaserv.com");
    }

    public FileSingleResponse getInvoiceFile(java.util.UUID id) {
        return get("/invoices/"+id+"/file").object(FileSingleResponse.class);
    }

    public InvoicePositionSingleResponse createInvoicePosition(String id, PositionCreateRequest body) {
        return post("/invoices/"+id+"/positions", body).object(InvoicePositionSingleResponse.class);
    }

    public InvoicePositionListResponse getInvoicePositions(String id) {
        return get("/invoices/"+id+"/positions").object(InvoicePositionListResponse.class);
    }

    public InvoicePositionListResponse getInvoicePositions(String id, int page, int pageSize, String search) {
        return get("/invoices/"+id+"/positions").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).object(InvoicePositionListResponse.class);
    }

    public BillingPositionSingleResponse getBillingPosition(java.util.UUID id) {
        return get("/billing-positions/"+id).object(BillingPositionSingleResponse.class);
    }

    public EmptyResponse deleteBillingPosition(java.util.UUID id) {
        return delete("/billing-positions/"+id).object(EmptyResponse.class);
    }

    public BillingPositionSingleResponse updateBillingPosition(java.util.UUID id, BillingPositionUpdateRequest body) {
        return put("/billing-positions/"+id, body).object(BillingPositionSingleResponse.class);
    }

    public BillingPositionSingleResponse createBillingPosition(BillingPositionCreateRequest body) {
        return post("/billing-positions", body).object(BillingPositionSingleResponse.class);
    }

    public BillingPositionListResponse getBillingPositions() {
        return get("/billing-positions").object(BillingPositionListResponse.class);
    }

    public BillingPositionListResponse getBillingPositions(int page, int pageSize, String search) {
        return get("/billing-positions").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).object(BillingPositionListResponse.class);
    }

    public CustomerSingleResponse createCustomer(CustomerCreateRequest body) {
        return post("/customers", body).object(CustomerSingleResponse.class);
    }

    public CustomerListResponse getCustomers() {
        return get("/customers").object(CustomerListResponse.class);
    }

    public CustomerListResponse getCustomers(int page, int pageSize, String search) {
        return get("/customers").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).object(CustomerListResponse.class);
    }

    public DebitListResponse getDebits() {
        return get("/debits").object(DebitListResponse.class);
    }

    public DebitListResponse getDebits(int page, int pageSize, String search) {
        return get("/debits").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).object(DebitListResponse.class);
    }

    public CustomerSingleResponse getCustomer(int id) {
        return get("/customers/"+id).object(CustomerSingleResponse.class);
    }

    public CustomerSingleResponse updateCustomer(int id, CustomerUpdateRequest body) {
        return put("/customers/"+id, body).object(CustomerSingleResponse.class);
    }

    public OnlinePaymentListResponse getOnlinePayments() {
        return get("/online-payments").object(OnlinePaymentListResponse.class);
    }

    public OnlinePaymentListResponse getOnlinePayments(int page, int pageSize, String search) {
        return get("/online-payments").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).object(OnlinePaymentListResponse.class);
    }

    public ServiceContractPositionSingleResponse getServiceContractPosition(String contract_id, String id) {
        return get("/service-contracts/"+contract_id+"/positions/"+id).object(ServiceContractPositionSingleResponse.class);
    }

    public EmptyResponse deleteServiceContractPosition(String contract_id, String id) {
        return delete("/service-contracts/"+contract_id+"/positions/"+id).object(EmptyResponse.class);
    }

    public ServiceContractPositionSingleResponse updateServiceContractPosition(String contract_id, String id, PositionUpdateRequest body) {
        return put("/service-contracts/"+contract_id+"/positions/"+id, body).object(ServiceContractPositionSingleResponse.class);
    }

    public InvoiceSingleResponse createInvoice(InvoiceCreateRequest body) {
        return post("/invoices", body).object(InvoiceSingleResponse.class);
    }

    public InvoiceListResponse getInvoices() {
        return get("/invoices").object(InvoiceListResponse.class);
    }

    public InvoiceListResponse getInvoices(int page, int pageSize, String search) {
        return get("/invoices").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).object(InvoiceListResponse.class);
    }

    public ServiceContractPositionSingleResponse createServiceContractPosition(String contract_id, PositionCreateRequest body) {
        return post("/service-contracts/"+contract_id+"/positions", body).object(ServiceContractPositionSingleResponse.class);
    }

    public ServiceContractPositionListResponse getServiceContractPositions(String contract_id) {
        return get("/service-contracts/"+contract_id+"/positions").object(ServiceContractPositionListResponse.class);
    }

    public OfferPositionSingleResponse getOfferPosition(java.util.UUID id) {
        return get("/offer-positions/"+id).object(OfferPositionSingleResponse.class);
    }

    public EmptyResponse deleteOfferPosition(java.util.UUID id) {
        return delete("/offer-positions/"+id).object(EmptyResponse.class);
    }

    public OfferPositionSingleResponse updateOfferPosition(java.util.UUID id, OfferPositionUpdateRequest body) {
        return put("/offer-positions/"+id, body).object(OfferPositionSingleResponse.class);
    }

    public PaymentReminderSingleResponse getPaymentReminder(java.util.UUID id) {
        return get("/payment-reminders/"+id).object(PaymentReminderSingleResponse.class);
    }

    public PaymentReminderSingleResponse updatePaymentReminder(java.util.UUID id, PaymentReminderUpdateRequest body) {
        return put("/payment-reminders/"+id, body).object(PaymentReminderSingleResponse.class);
    }

    public DebitMandateSingleResponse createDebitMandate(DebitMandateCreateRequest body) {
        return post("/debit-mandates", body).object(DebitMandateSingleResponse.class);
    }

    public DebitMandateListResponse getDebitMandates() {
        return get("/debit-mandates").object(DebitMandateListResponse.class);
    }

    public DebitMandateListResponse getDebitMandates(int page, int pageSize, String search) {
        return get("/debit-mandates").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).object(DebitMandateListResponse.class);
    }

    public BankTransactionListResponse getBankTransactions() {
        return get("/bank-transactions").object(BankTransactionListResponse.class);
    }

    public BankTransactionListResponse getBankTransactions(int page, int pageSize, String search) {
        return get("/bank-transactions").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).object(BankTransactionListResponse.class);
    }

    public DebitMandateSingleResponse getDebitMandate(java.util.UUID id) {
        return get("/debit-mandates/"+id).object(DebitMandateSingleResponse.class);
    }

    public BankTransactionSingleResponse getBankTransaction(java.util.UUID id) {
        return get("/bank-transactions/"+id).object(BankTransactionSingleResponse.class);
    }

    public OfferSingleResponse getOffer(java.util.UUID id) {
        return get("/offers/"+id).object(OfferSingleResponse.class);
    }

    public OfferSingleResponse updateOffer(java.util.UUID id, OfferUpdateRequest body) {
        return put("/offers/"+id, body).object(OfferSingleResponse.class);
    }

    public InvoicePositionSingleResponse getInvoicePosition(String invoice_id, String id) {
        return get("/invoices/"+invoice_id+"/positions/"+id).object(InvoicePositionSingleResponse.class);
    }

    public EmptyResponse deleteInvoicePosition(String invoice_id, String id) {
        return delete("/invoices/"+invoice_id+"/positions/"+id).object(EmptyResponse.class);
    }

    public InvoicePositionSingleResponse updateInvoicePosition(String invoice_id, String id, PositionUpdateRequest body) {
        return put("/invoices/"+invoice_id+"/positions/"+id, body).object(InvoicePositionSingleResponse.class);
    }

    public ServiceContractSingleResponse createServiceContract(ServiceContractCreateRequest body) {
        return post("/service-contracts", body).object(ServiceContractSingleResponse.class);
    }

    public ServiceContractListResponse getServiceContracts() {
        return get("/service-contracts").object(ServiceContractListResponse.class);
    }

    public ServiceContractListResponse getServiceContracts(int page, int pageSize, String search) {
        return get("/service-contracts").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).object(ServiceContractListResponse.class);
    }

    public InvoiceSingleResponse getInvoice(java.util.UUID id) {
        return get("/invoices/"+id).object(InvoiceSingleResponse.class);
    }

    public EmptyResponse deleteInvoice(java.util.UUID id) {
        return delete("/invoices/"+id).object(EmptyResponse.class);
    }

    public InvoiceSingleResponse updateInvoice(java.util.UUID id, InvoiceUpdateRequest body) {
        return put("/invoices/"+id, body).object(InvoiceSingleResponse.class);
    }

    public OnlinePaymentSingleResponse getOnlinePayment(java.util.UUID id) {
        return get("/online-payments/"+id).object(OnlinePaymentSingleResponse.class);
    }

    public DebitSingleResponse getDebit(java.util.UUID id) {
        return get("/debits/"+id).object(DebitSingleResponse.class);
    }

    public OfferSingleResponse createOffer(OfferCreateRequest body) {
        return post("/offers", body).object(OfferSingleResponse.class);
    }

    public OfferListResponse getOffers() {
        return get("/offers").object(OfferListResponse.class);
    }

    public OfferListResponse getOffers(int page, int pageSize, String search) {
        return get("/offers").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).object(OfferListResponse.class);
    }

    public ServiceContractSingleResponse getServiceContract(java.util.UUID id) {
        return get("/service-contracts/"+id).object(ServiceContractSingleResponse.class);
    }

    public EmptyResponse deleteServiceContract(java.util.UUID id) {
        return delete("/service-contracts/"+id).object(EmptyResponse.class);
    }

    public ServiceContractSingleResponse updateServiceContract(java.util.UUID id, ServiceContractUpdateRequest body) {
        return put("/service-contracts/"+id, body).object(ServiceContractSingleResponse.class);
    }

    public OfferPositionSingleResponse createOfferPosition(OfferPositionCreateRequest body) {
        return post("/offer-positions", body).object(OfferPositionSingleResponse.class);
    }

    public OfferPositionListResponse getOfferPositions() {
        return get("/offer-positions").object(OfferPositionListResponse.class);
    }

    public OfferPositionListResponse getOfferPositions(int page, int pageSize, String search) {
        return get("/offer-positions").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).object(OfferPositionListResponse.class);
    }

    public PaymentReminderSingleResponse createPaymentReminder(PaymentReminderCreateRequest body) {
        return post("/payment-reminders", body).object(PaymentReminderSingleResponse.class);
    }

    public PaymentReminderListResponse getPaymentReminders() {
        return get("/payment-reminders").object(PaymentReminderListResponse.class);
    }

    public PaymentReminderListResponse getPaymentReminders(int page, int pageSize, String search) {
        return get("/payment-reminders").query("page", String.valueOf(page)).query("page_size", String.valueOf(pageSize)).query("search", String.valueOf(search)).object(PaymentReminderListResponse.class);
    }


}