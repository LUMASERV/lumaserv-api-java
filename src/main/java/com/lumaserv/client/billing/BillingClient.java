package com.lumaserv.client.billing;

import org.javawebstack.httpclient.HTTPClient;
import org.javawebstack.httpclient.HTTPRequest;

public class BillingClient extends HTTPClient {
    public BillingClient(String apiKey, String baseUrl) {
        bearer(apiKey);
        setBaseUrl(baseUrl);
    }

    public BillingClient(String apiKey) {
        this(apiKey, "https://billing.lumaserv.com");
    }

    private HTTPRequest wrapRequest(HTTPRequest r) throws ClientException {
        if(r.status() < 200 || (r.status() >= 300 && r.status() < 400))
            throw new ClientException(r);
        return r;
    }

    public FileSingleResponse getInvoiceFile(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/invoices/"+id+"/file")).object(FileSingleResponse.class);
    }

    public InvoicePositionSingleResponse createInvoicePosition(String id, PositionCreateRequest body) throws ClientException {
        return wrapRequest(post("/invoices/"+id+"/positions", body)).object(InvoicePositionSingleResponse.class);
    }

    public InvoicePositionListResponse getInvoicePositions(String id) throws ClientException {
        return wrapRequest(get("/invoices/"+id+"/positions")).object(InvoicePositionListResponse.class);
    }

    public InvoicePositionListResponse getInvoicePositions(String id, java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/invoices/"+id+"/positions").query(params)).object(InvoicePositionListResponse.class);
    }

    public BillingPositionSingleResponse getBillingPosition(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/billing-positions/"+id)).object(BillingPositionSingleResponse.class);
    }

    public EmptyResponse deleteBillingPosition(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/billing-positions/"+id)).object(EmptyResponse.class);
    }

    public BillingPositionSingleResponse updateBillingPosition(java.util.UUID id, BillingPositionUpdateRequest body) throws ClientException {
        return wrapRequest(put("/billing-positions/"+id, body)).object(BillingPositionSingleResponse.class);
    }

    public BillingPositionSingleResponse createBillingPosition(BillingPositionCreateRequest body) throws ClientException {
        return wrapRequest(post("/billing-positions", body)).object(BillingPositionSingleResponse.class);
    }

    public BillingPositionListResponse getBillingPositions() throws ClientException {
        return wrapRequest(get("/billing-positions")).object(BillingPositionListResponse.class);
    }

    public BillingPositionListResponse getBillingPositions(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/billing-positions").query(params)).object(BillingPositionListResponse.class);
    }

    public CustomerSingleResponse createCustomer(CustomerCreateRequest body) throws ClientException {
        return wrapRequest(post("/customers", body)).object(CustomerSingleResponse.class);
    }

    public CustomerListResponse getCustomers() throws ClientException {
        return wrapRequest(get("/customers")).object(CustomerListResponse.class);
    }

    public CustomerListResponse getCustomers(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/customers").query(params)).object(CustomerListResponse.class);
    }

    public DebitListResponse getDebits() throws ClientException {
        return wrapRequest(get("/debits")).object(DebitListResponse.class);
    }

    public DebitListResponse getDebits(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/debits").query(params)).object(DebitListResponse.class);
    }

    public CustomerSingleResponse getCustomer(int id) throws ClientException {
        return wrapRequest(get("/customers/"+id)).object(CustomerSingleResponse.class);
    }

    public CustomerSingleResponse updateCustomer(int id, CustomerUpdateRequest body) throws ClientException {
        return wrapRequest(put("/customers/"+id, body)).object(CustomerSingleResponse.class);
    }

    public OnlinePaymentListResponse getOnlinePayments() throws ClientException {
        return wrapRequest(get("/online-payments")).object(OnlinePaymentListResponse.class);
    }

    public OnlinePaymentListResponse getOnlinePayments(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/online-payments").query(params)).object(OnlinePaymentListResponse.class);
    }

    public ServiceContractPositionSingleResponse getServiceContractPosition(String contract_id, String id) throws ClientException {
        return wrapRequest(get("/service-contracts/"+contract_id+"/positions/"+id)).object(ServiceContractPositionSingleResponse.class);
    }

    public EmptyResponse deleteServiceContractPosition(String contract_id, String id) throws ClientException {
        return wrapRequest(delete("/service-contracts/"+contract_id+"/positions/"+id)).object(EmptyResponse.class);
    }

    public ServiceContractPositionSingleResponse updateServiceContractPosition(String contract_id, String id, PositionUpdateRequest body) throws ClientException {
        return wrapRequest(put("/service-contracts/"+contract_id+"/positions/"+id, body)).object(ServiceContractPositionSingleResponse.class);
    }

    public InvoiceSingleResponse createInvoice(InvoiceCreateRequest body) throws ClientException {
        return wrapRequest(post("/invoices", body)).object(InvoiceSingleResponse.class);
    }

    public InvoiceListResponse getInvoices() throws ClientException {
        return wrapRequest(get("/invoices")).object(InvoiceListResponse.class);
    }

    public InvoiceListResponse getInvoices(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/invoices").query(params)).object(InvoiceListResponse.class);
    }

    public ServiceContractPositionSingleResponse createServiceContractPosition(String contract_id, PositionCreateRequest body) throws ClientException {
        return wrapRequest(post("/service-contracts/"+contract_id+"/positions", body)).object(ServiceContractPositionSingleResponse.class);
    }

    public ServiceContractPositionListResponse getServiceContractPositions(String contract_id) throws ClientException {
        return wrapRequest(get("/service-contracts/"+contract_id+"/positions")).object(ServiceContractPositionListResponse.class);
    }

    public OfferPositionSingleResponse getOfferPosition(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/offer-positions/"+id)).object(OfferPositionSingleResponse.class);
    }

    public EmptyResponse deleteOfferPosition(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/offer-positions/"+id)).object(EmptyResponse.class);
    }

    public OfferPositionSingleResponse updateOfferPosition(java.util.UUID id, OfferPositionUpdateRequest body) throws ClientException {
        return wrapRequest(put("/offer-positions/"+id, body)).object(OfferPositionSingleResponse.class);
    }

    public PaymentReminderSingleResponse getPaymentReminder(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/payment-reminders/"+id)).object(PaymentReminderSingleResponse.class);
    }

    public PaymentReminderSingleResponse updatePaymentReminder(java.util.UUID id, PaymentReminderUpdateRequest body) throws ClientException {
        return wrapRequest(put("/payment-reminders/"+id, body)).object(PaymentReminderSingleResponse.class);
    }

    public DebitMandateSingleResponse createDebitMandate(DebitMandateCreateRequest body) throws ClientException {
        return wrapRequest(post("/debit-mandates", body)).object(DebitMandateSingleResponse.class);
    }

    public DebitMandateListResponse getDebitMandates() throws ClientException {
        return wrapRequest(get("/debit-mandates")).object(DebitMandateListResponse.class);
    }

    public DebitMandateListResponse getDebitMandates(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/debit-mandates").query(params)).object(DebitMandateListResponse.class);
    }

    public BankTransactionListResponse getBankTransactions() throws ClientException {
        return wrapRequest(get("/bank-transactions")).object(BankTransactionListResponse.class);
    }

    public BankTransactionListResponse getBankTransactions(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/bank-transactions").query(params)).object(BankTransactionListResponse.class);
    }

    public DebitMandateSingleResponse getDebitMandate(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/debit-mandates/"+id)).object(DebitMandateSingleResponse.class);
    }

    public BankTransactionSingleResponse getBankTransaction(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/bank-transactions/"+id)).object(BankTransactionSingleResponse.class);
    }

    public OfferSingleResponse getOffer(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/offers/"+id)).object(OfferSingleResponse.class);
    }

    public OfferSingleResponse updateOffer(java.util.UUID id, OfferUpdateRequest body) throws ClientException {
        return wrapRequest(put("/offers/"+id, body)).object(OfferSingleResponse.class);
    }

    public InvoicePositionSingleResponse getInvoicePosition(String invoice_id, String id) throws ClientException {
        return wrapRequest(get("/invoices/"+invoice_id+"/positions/"+id)).object(InvoicePositionSingleResponse.class);
    }

    public EmptyResponse deleteInvoicePosition(String invoice_id, String id) throws ClientException {
        return wrapRequest(delete("/invoices/"+invoice_id+"/positions/"+id)).object(EmptyResponse.class);
    }

    public InvoicePositionSingleResponse updateInvoicePosition(String invoice_id, String id, PositionUpdateRequest body) throws ClientException {
        return wrapRequest(put("/invoices/"+invoice_id+"/positions/"+id, body)).object(InvoicePositionSingleResponse.class);
    }

    public ServiceContractSingleResponse createServiceContract(ServiceContractCreateRequest body) throws ClientException {
        return wrapRequest(post("/service-contracts", body)).object(ServiceContractSingleResponse.class);
    }

    public ServiceContractListResponse getServiceContracts() throws ClientException {
        return wrapRequest(get("/service-contracts")).object(ServiceContractListResponse.class);
    }

    public ServiceContractListResponse getServiceContracts(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/service-contracts").query(params)).object(ServiceContractListResponse.class);
    }

    public InvoiceSingleResponse getInvoice(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/invoices/"+id)).object(InvoiceSingleResponse.class);
    }

    public EmptyResponse deleteInvoice(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/invoices/"+id)).object(EmptyResponse.class);
    }

    public InvoiceSingleResponse updateInvoice(java.util.UUID id, InvoiceUpdateRequest body) throws ClientException {
        return wrapRequest(put("/invoices/"+id, body)).object(InvoiceSingleResponse.class);
    }

    public OnlinePaymentSingleResponse getOnlinePayment(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/online-payments/"+id)).object(OnlinePaymentSingleResponse.class);
    }

    public DebitSingleResponse getDebit(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/debits/"+id)).object(DebitSingleResponse.class);
    }

    public OfferSingleResponse createOffer(OfferCreateRequest body) throws ClientException {
        return wrapRequest(post("/offers", body)).object(OfferSingleResponse.class);
    }

    public OfferListResponse getOffers() throws ClientException {
        return wrapRequest(get("/offers")).object(OfferListResponse.class);
    }

    public OfferListResponse getOffers(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/offers").query(params)).object(OfferListResponse.class);
    }

    public ServiceContractSingleResponse getServiceContract(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/service-contracts/"+id)).object(ServiceContractSingleResponse.class);
    }

    public EmptyResponse deleteServiceContract(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/service-contracts/"+id)).object(EmptyResponse.class);
    }

    public ServiceContractSingleResponse updateServiceContract(java.util.UUID id, ServiceContractUpdateRequest body) throws ClientException {
        return wrapRequest(put("/service-contracts/"+id, body)).object(ServiceContractSingleResponse.class);
    }

    public OfferPositionSingleResponse createOfferPosition(OfferPositionCreateRequest body) throws ClientException {
        return wrapRequest(post("/offer-positions", body)).object(OfferPositionSingleResponse.class);
    }

    public OfferPositionListResponse getOfferPositions() throws ClientException {
        return wrapRequest(get("/offer-positions")).object(OfferPositionListResponse.class);
    }

    public OfferPositionListResponse getOfferPositions(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/offer-positions").query(params)).object(OfferPositionListResponse.class);
    }

    public PaymentReminderSingleResponse createPaymentReminder(PaymentReminderCreateRequest body) throws ClientException {
        return wrapRequest(post("/payment-reminders", body)).object(PaymentReminderSingleResponse.class);
    }

    public PaymentReminderListResponse getPaymentReminders() throws ClientException {
        return wrapRequest(get("/payment-reminders")).object(PaymentReminderListResponse.class);
    }

    public PaymentReminderListResponse getPaymentReminders(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/payment-reminders").query(params)).object(PaymentReminderListResponse.class);
    }


}