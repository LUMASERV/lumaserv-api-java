package com.lumaserv.client.billing;

import org.javawebstack.httpclient.HTTPClient;

public class BillingClient extends HttpClient {
    public BillingClient(String apiKey, String baseUrl) {
        bearer(apiKey);
        setBaseUrl(baseUrl);
    }

    public BillingClient(String apiKey) {
        this(apiKey, "https://billing.lumaserv.com");
    }

	public FileSingleResponse getInvoiceFile(String id) {
		return get("/invoices/"+id+"/file").object(FileSingleResponse.class);
	}

	public BillingPositionSingleResponse getBillingPosition(String id) {
		return get("/billing-positions/"+id).object(BillingPositionSingleResponse.class);
	}

	public EmptyResponse deleteBillingPosition(String id) {
		return delete("/billing-positions/"+id).object(EmptyResponse.class);
	}

	public BillingPositionSingleResponse updateBillingPosition(String id, BillingPositionUpdateRequest body) {
		return put("/billing-positions/"+id, body).object(BillingPositionSingleResponse.class);
	}

	public BankAccountSingleResponse createBankAccount(BankAccountCreateRequest body) {
		return post("/bank-accounts", body).object(BankAccountSingleResponse.class);
	}

	public BankAccountListResponse getBankAccounts() {
		return get("/bank-accounts").object(BankAccountListResponse.class);
	}

	public BankAccountListResponse getBankAccounts(int page, int pageSize, String search) {
		return get("/bank-accounts").query("page", page).query("page_size", pageSize).query("search", search).object(BankAccountListResponse.class);
	}

	public ServiceContractPositionSingleResponse createServiceContractPosition(ServiceContractPositionCreateRequest body) {
		return post("/service-contract-positions", body).object(ServiceContractPositionSingleResponse.class);
	}

	public ServiceContractPositionListResponse getServiceContractPositions() {
		return get("/service-contract-positions").object(ServiceContractPositionListResponse.class);
	}

	public ServiceContractPositionListResponse getServiceContractPositions(int page, int pageSize, String search) {
		return get("/service-contract-positions").query("page", page).query("page_size", pageSize).query("search", search).object(ServiceContractPositionListResponse.class);
	}

	public BillingPositionSingleResponse createBillingPosition(BillingPositionCreateRequest body) {
		return post("/billing-positions", body).object(BillingPositionSingleResponse.class);
	}

	public BillingPositionListResponse getBillingPositions() {
		return get("/billing-positions").object(BillingPositionListResponse.class);
	}

	public BillingPositionListResponse getBillingPositions(int page, int pageSize, String search) {
		return get("/billing-positions").query("page", page).query("page_size", pageSize).query("search", search).object(BillingPositionListResponse.class);
	}

	public CustomerSingleResponse createCustomer(CustomerCreateRequest body) {
		return post("/customers", body).object(CustomerSingleResponse.class);
	}

	public CustomerListResponse getCustomers() {
		return get("/customers").object(CustomerListResponse.class);
	}

	public CustomerListResponse getCustomers(int page, int pageSize, String search) {
		return get("/customers").query("page", page).query("page_size", pageSize).query("search", search).object(CustomerListResponse.class);
	}

	public InvoicePositionSingleResponse getInvoicePosition(String id) {
		return get("/invoice-positions/"+id).object(InvoicePositionSingleResponse.class);
	}

	public EmptyResponse deleteInvoicePosition(String id) {
		return delete("/invoice-positions/"+id).object(EmptyResponse.class);
	}

	public InvoicePositionSingleResponse updateInvoicePosition(String id, InvoicePositionUpdateRequest body) {
		return put("/invoice-positions/"+id, body).object(InvoicePositionSingleResponse.class);
	}

	public DebitListResponse getDebits() {
		return get("/debits").object(DebitListResponse.class);
	}

	public DebitListResponse getDebits(int page, int pageSize, String search) {
		return get("/debits").query("page", page).query("page_size", pageSize).query("search", search).object(DebitListResponse.class);
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
		return get("/online-payments").query("page", page).query("page_size", pageSize).query("search", search).object(OnlinePaymentListResponse.class);
	}

	public FileDownloadResponse getFileDownload(String id) {
		return get("/files/"+id+"/download").object(FileDownloadResponse.class);
	}

	public InvoiceSingleResponse createInvoice(InvoiceCreateRequest body) {
		return post("/invoices", body).object(InvoiceSingleResponse.class);
	}

	public InvoiceListResponse getInvoices() {
		return get("/invoices").object(InvoiceListResponse.class);
	}

	public InvoiceListResponse getInvoices(int page, int pageSize, String search) {
		return get("/invoices").query("page", page).query("page_size", pageSize).query("search", search).object(InvoiceListResponse.class);
	}

	public OfferPositionSingleResponse getOfferPosition(String id) {
		return get("/offer-positions/"+id).object(OfferPositionSingleResponse.class);
	}

	public EmptyResponse deleteOfferPosition(String id) {
		return delete("/offer-positions/"+id).object(EmptyResponse.class);
	}

	public OfferPositionSingleResponse updateOfferPosition(String id, OfferPositionUpdateRequest body) {
		return put("/offer-positions/"+id, body).object(OfferPositionSingleResponse.class);
	}

	public FileSingleResponse getFile(String id) {
		return get("/files/"+id).object(FileSingleResponse.class);
	}

	public ServiceContractPositionSingleResponse getServiceContractPosition(String id) {
		return get("/service-contract-positions/"+id).object(ServiceContractPositionSingleResponse.class);
	}

	public EmptyResponse deleteServiceContractPosition(String id) {
		return delete("/service-contract-positions/"+id).object(EmptyResponse.class);
	}

	public ServiceContractPositionSingleResponse updateServiceContractPosition(String id, ServiceContractPositionUpdateRequest body) {
		return put("/service-contract-positions/"+id, body).object(ServiceContractPositionSingleResponse.class);
	}

	public PaymentReminderSingleResponse getPaymentReminder(String id) {
		return get("/payment-reminders/"+id).object(PaymentReminderSingleResponse.class);
	}

	public PaymentReminderSingleResponse updatePaymentReminder(String id, PaymentReminderUpdateRequest body) {
		return put("/payment-reminders/"+id, body).object(PaymentReminderSingleResponse.class);
	}

	public DebitMandateSingleResponse createDebitMandate(DebitMandateCreateRequest body) {
		return post("/debit-mandates", body).object(DebitMandateSingleResponse.class);
	}

	public DebitMandateListResponse getDebitMandates() {
		return get("/debit-mandates").object(DebitMandateListResponse.class);
	}

	public DebitMandateListResponse getDebitMandates(int page, int pageSize, String search) {
		return get("/debit-mandates").query("page", page).query("page_size", pageSize).query("search", search).object(DebitMandateListResponse.class);
	}

	public BankTransactionListResponse getBankTransactions() {
		return get("/bank-transactions").object(BankTransactionListResponse.class);
	}

	public BankTransactionListResponse getBankTransactions(int page, int pageSize, String search) {
		return get("/bank-transactions").query("page", page).query("page_size", pageSize).query("search", search).object(BankTransactionListResponse.class);
	}

	public DebitMandateSingleResponse getDebitMandate(String id) {
		return get("/debit-mandates/"+id).object(DebitMandateSingleResponse.class);
	}

	public BankAccountSingleResponse getBankAccount(String id) {
		return get("/bank-accounts/"+id).object(BankAccountSingleResponse.class);
	}

	public EmptyResponse deleteBankAccount(String id) {
		return delete("/bank-accounts/"+id).object(EmptyResponse.class);
	}

	public BankAccountSingleResponse updateBankAccount(String id, BankAccountUpdateRequest body) {
		return put("/bank-accounts/"+id, body).object(BankAccountSingleResponse.class);
	}

	public BankTransactionSingleResponse getBankTransaction(String id) {
		return get("/bank-transactions/"+id).object(BankTransactionSingleResponse.class);
	}

	public OfferSingleResponse getOffer(String id) {
		return get("/offers/"+id).object(OfferSingleResponse.class);
	}

	public OfferSingleResponse updateOffer(String id, OfferUpdateRequest body) {
		return put("/offers/"+id, body).object(OfferSingleResponse.class);
	}

	public FileListResponse getFiles() {
		return get("/files").object(FileListResponse.class);
	}

	public FileListResponse getFiles(int page, int pageSize, String search) {
		return get("/files").query("page", page).query("page_size", pageSize).query("search", search).object(FileListResponse.class);
	}

	public ServiceContractSingleResponse createServiceContract(ServiceContractCreateRequest body) {
		return post("/service-contracts", body).object(ServiceContractSingleResponse.class);
	}

	public ServiceContractListResponse getServiceContracts() {
		return get("/service-contracts").object(ServiceContractListResponse.class);
	}

	public ServiceContractListResponse getServiceContracts(int page, int pageSize, String search) {
		return get("/service-contracts").query("page", page).query("page_size", pageSize).query("search", search).object(ServiceContractListResponse.class);
	}

	public InvoiceSingleResponse getInvoice(String id) {
		return get("/invoices/"+id).object(InvoiceSingleResponse.class);
	}

	public InvoiceSingleResponse updateInvoice(String id, InvoiceUpdateRequest body) {
		return put("/invoices/"+id, body).object(InvoiceSingleResponse.class);
	}

	public OnlinePaymentSingleResponse getOnlinePayment(String id) {
		return get("/online-payments/"+id).object(OnlinePaymentSingleResponse.class);
	}

	public CustomerTransactionSingleResponse getCustomerTransaction(String id) {
		return get("/customer-transactions/"+id).object(CustomerTransactionSingleResponse.class);
	}

	public InvoicePositionSingleResponse createInvoicePosition(InvoicePositionCreateRequest body) {
		return post("/invoice-positions", body).object(InvoicePositionSingleResponse.class);
	}

	public InvoicePositionListResponse getInvoicePositions() {
		return get("/invoice-positions").object(InvoicePositionListResponse.class);
	}

	public InvoicePositionListResponse getInvoicePositions(int page, int pageSize, String search) {
		return get("/invoice-positions").query("page", page).query("page_size", pageSize).query("search", search).object(InvoicePositionListResponse.class);
	}

	public DebitSingleResponse getDebit(String id) {
		return get("/debits/"+id).object(DebitSingleResponse.class);
	}

	public OfferSingleResponse createOffer(OfferCreateRequest body) {
		return post("/offers", body).object(OfferSingleResponse.class);
	}

	public OfferListResponse getOffers() {
		return get("/offers").object(OfferListResponse.class);
	}

	public OfferListResponse getOffers(int page, int pageSize, String search) {
		return get("/offers").query("page", page).query("page_size", pageSize).query("search", search).object(OfferListResponse.class);
	}

	public ServiceContractSingleResponse getServiceContract(String id) {
		return get("/service-contracts/"+id).object(ServiceContractSingleResponse.class);
	}

	public EmptyResponse deleteServiceContract(String id) {
		return delete("/service-contracts/"+id).object(EmptyResponse.class);
	}

	public ServiceContractSingleResponse updateServiceContract(String id, ServiceContractUpdateRequest body) {
		return put("/service-contracts/"+id, body).object(ServiceContractSingleResponse.class);
	}

	public CustomerTransactionListResponse getCustomerTransactions() {
		return get("/customer-transactions").object(CustomerTransactionListResponse.class);
	}

	public CustomerTransactionListResponse getCustomerTransactions(int page, int pageSize, String search) {
		return get("/customer-transactions").query("page", page).query("page_size", pageSize).query("search", search).object(CustomerTransactionListResponse.class);
	}

	public OfferPositionSingleResponse createOfferPosition(OfferPositionCreateRequest body) {
		return post("/offer-positions", body).object(OfferPositionSingleResponse.class);
	}

	public OfferPositionListResponse getOfferPositions() {
		return get("/offer-positions").object(OfferPositionListResponse.class);
	}

	public OfferPositionListResponse getOfferPositions(int page, int pageSize, String search) {
		return get("/offer-positions").query("page", page).query("page_size", pageSize).query("search", search).object(OfferPositionListResponse.class);
	}

	public PaymentReminderSingleResponse createPaymentReminder(PaymentReminderCreateRequest body) {
		return post("/payment-reminders", body).object(PaymentReminderSingleResponse.class);
	}

	public PaymentReminderListResponse getPaymentReminders() {
		return get("/payment-reminders").object(PaymentReminderListResponse.class);
	}

	public PaymentReminderListResponse getPaymentReminders(int page, int pageSize, String search) {
		return get("/payment-reminders").query("page", page).query("page_size", pageSize).query("search", search).object(PaymentReminderListResponse.class);
	}


}