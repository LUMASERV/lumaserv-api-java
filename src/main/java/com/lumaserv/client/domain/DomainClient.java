package com.lumaserv.client.domain;

import org.javawebstack.httpclient.HTTPClient;
import org.javawebstack.httpclient.HTTPRequest;

public class DomainClient extends HTTPClient {
    public DomainClient(String apiKey, String baseUrl) {
        bearer(apiKey);
        setBaseUrl(baseUrl);
    }

    public DomainClient(String apiKey) {
        this(apiKey, "https://api.lumaserv.com/domain");
    }

    private HTTPRequest wrapRequest(HTTPRequest r) throws ClientException {
        if(r.status() < 200 || (r.status() >= 300 && r.status() < 400))
            throw new ClientException(r);
        return r;
    }

    public DomainHandleSingleResponse getDomainHandle(String code) throws ClientException {
        return wrapRequest(get("/domain-handles/"+code)).object(DomainHandleSingleResponse.class);
    }

    public EmptyResponse deleteDomainHandle(String code) throws ClientException {
        return wrapRequest(delete("/domain-handles/"+code)).object(EmptyResponse.class);
    }

    public DomainHandleSingleResponse updateDomainHandle(String code, DomainHandleUpdateRequest body) throws ClientException {
        return wrapRequest(put("/domain-handles/"+code, body)).object(DomainHandleSingleResponse.class);
    }

    public DomainSingleResponse unscheduleDomainDelete(String name) throws ClientException {
        return wrapRequest(post("/domains/"+name+"/unschedule-delete")).object(DomainSingleResponse.class);
    }

    public DNSRecordSingleResponse createDNSZoneRecord(String name, DNSRecordCreateRequest body) throws ClientException {
        return wrapRequest(post("/dns/zones/"+name+"/records", body)).object(DNSRecordSingleResponse.class);
    }

    public DNSRecordListResponse getDNSZoneRecords(String name) throws ClientException {
        return wrapRequest(get("/dns/zones/"+name+"/records")).object(DNSRecordListResponse.class);
    }

    public DNSRecordListResponse getDNSZoneRecords(String name, java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/dns/zones/"+name+"/records").query(params)).object(DNSRecordListResponse.class);
    }

    public DNSRecordListResponse updateDNSZoneRecords(String name, DNSRecordsUpdateRequest[] body) throws ClientException {
        return wrapRequest(put("/dns/zones/"+name+"/records", body)).object(DNSRecordListResponse.class);
    }

    public DomainSingleResponse scheduleDomainDelete(String name, DomainScheduleDeleteRequest body) throws ClientException {
        return wrapRequest(post("/domains/"+name+"/schedule-delete", body)).object(DomainSingleResponse.class);
    }

    public SearchResponse search() throws ClientException {
        return wrapRequest(get("/search")).object(SearchResponse.class);
    }

    public SearchResponse search(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/search").query(params)).object(SearchResponse.class);
    }

    public DomainPriceListResponse getDomainPricingList() throws ClientException {
        return wrapRequest(get("/pricing/domains")).object(DomainPriceListResponse.class);
    }

    public DomainPriceListResponse getDomainPricingList(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/pricing/domains").query(params)).object(DomainPriceListResponse.class);
    }

    public DomainAuthinfoResponse getDomainAuthinfo(String name) throws ClientException {
        return wrapRequest(get("/domains/"+name+"/authinfo")).object(DomainAuthinfoResponse.class);
    }

    public EmptyResponse removeDomainAuthinfo(String name) throws ClientException {
        return wrapRequest(delete("/domains/"+name+"/authinfo")).object(EmptyResponse.class);
    }

    public EmptyResponse restoreDomain(String name) throws ClientException {
        return wrapRequest(post("/domains/"+name+"/restore")).object(EmptyResponse.class);
    }

    public DNSZoneListResponse getDNSZones() throws ClientException {
        return wrapRequest(get("/dns/zones")).object(DNSZoneListResponse.class);
    }

    public DNSZoneListResponse getDNSZones(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/dns/zones").query(params)).object(DNSZoneListResponse.class);
    }

    public EmptyResponse deleteDNSRecord(String name, java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/dns/zones/"+name+"/records/"+id)).object(EmptyResponse.class);
    }

    public DNSRecordSingleResponse updateDNSRecord(String name, java.util.UUID id, DNSRecordUpdateRequest body) throws ClientException {
        return wrapRequest(put("/dns/zones/"+name+"/records/"+id, body)).object(DNSRecordSingleResponse.class);
    }

    public EmptyResponse sendDomainVerification(String name) throws ClientException {
        return wrapRequest(post("/domains/"+name+"/verification")).object(EmptyResponse.class);
    }

    public DomainCheckVerificationResponse checkDomainVerification(String name) throws ClientException {
        return wrapRequest(get("/domains/"+name+"/verification")).object(DomainCheckVerificationResponse.class);
    }

    public DNSZoneSingleResponse getDNSZone(String name) throws ClientException {
        return wrapRequest(get("/dns/zones/"+name)).object(DNSZoneSingleResponse.class);
    }

    public DNSZoneSingleResponse updateDNSZone(String name, DNSZoneUpdateRequest body) throws ClientException {
        return wrapRequest(put("/dns/zones/"+name, body)).object(DNSZoneSingleResponse.class);
    }

    public LabelListResponse getLabels() throws ClientException {
        return wrapRequest(get("/labels")).object(LabelListResponse.class);
    }

    public LabelListResponse getLabels(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/labels").query(params)).object(LabelListResponse.class);
    }

    public DomainHandleSingleResponse createDomainHandle(DomainHandleCreateRequest body) throws ClientException {
        return wrapRequest(post("/domain-handles", body)).object(DomainHandleSingleResponse.class);
    }

    public DomainHandleListResponse getDomainHandles() throws ClientException {
        return wrapRequest(get("/domain-handles")).object(DomainHandleListResponse.class);
    }

    public DomainHandleListResponse getDomainHandles(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/domain-handles").query(params)).object(DomainHandleListResponse.class);
    }

    public DomainCheckResponse checkDomain(String name) throws ClientException {
        return wrapRequest(get("/domains/"+name+"/check")).object(DomainCheckResponse.class);
    }

    public DomainSingleResponse createDomain(DomainCreateRequest body) throws ClientException {
        return wrapRequest(post("/domains", body)).object(DomainSingleResponse.class);
    }

    public DomainListResponse getDomains() throws ClientException {
        return wrapRequest(get("/domains")).object(DomainListResponse.class);
    }

    public DomainListResponse getDomains(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/domains").query(params)).object(DomainListResponse.class);
    }

    public DomainSingleResponse getDomain(String name) throws ClientException {
        return wrapRequest(get("/domains/"+name)).object(DomainSingleResponse.class);
    }

    public EmptyResponse deleteDomain(String name) throws ClientException {
        return wrapRequest(delete("/domains/"+name)).object(EmptyResponse.class);
    }

    public DomainSingleResponse updateDomain(String name, DomainUpdateRequest body) throws ClientException {
        return wrapRequest(put("/domains/"+name, body)).object(DomainSingleResponse.class);
    }


}