package com.lumaserv.client.addon;

import org.javawebstack.httpclient.HTTPClient;
import org.javawebstack.httpclient.HTTPRequest;

public class AddonClient extends HTTPClient {
    public AddonClient(String apiKey, String baseUrl) {
        bearer(apiKey);
        setBaseUrl(baseUrl);
    }

    public AddonClient(String apiKey) {
        this(apiKey, "https://api.lumaserv.com/addon");
    }

    private HTTPRequest wrapRequest(HTTPRequest r) throws ClientException {
        if(r.status() < 200 || (r.status() >= 300 && r.status() < 400))
            throw new ClientException(r);
        return r;
    }

    public SSLCertificateSingleResponse createSSLCertificate(SSLCertificateCreateRequest body) throws ClientException {
        return wrapRequest(post("/ssl/certificates", body)).object(SSLCertificateSingleResponse.class);
    }

    public SSLCertificateListResponse getSSLCertificates() throws ClientException {
        return wrapRequest(get("/ssl/certificates")).object(SSLCertificateListResponse.class);
    }

    public SSLCertificateListResponse getSSLCertificates(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/ssl/certificates").query(params)).object(SSLCertificateListResponse.class);
    }

    public PleskLicenseTypeListResponse getPleskLicenseTypes() throws ClientException {
        return wrapRequest(get("/license/plesk-types")).object(PleskLicenseTypeListResponse.class);
    }

    public PleskLicenseTypeListResponse getPleskLicenseTypes(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/license/plesk-types").query(params)).object(PleskLicenseTypeListResponse.class);
    }

    public SearchResponse search() throws ClientException {
        return wrapRequest(get("/search")).object(SearchResponse.class);
    }

    public SearchResponse search(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/search").query(params)).object(SearchResponse.class);
    }

    public SSLCertificateSingleResponse getSSLCertificate(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/ssl/certificates/"+id)).object(SSLCertificateSingleResponse.class);
    }

    public SSLOrganisationSingleResponse getSSLOrganisation(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/ssl/organisations/"+id)).object(SSLOrganisationSingleResponse.class);
    }

    public EmptyResponse deleteSSLOrganisation(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/ssl/organisations/"+id)).object(EmptyResponse.class);
    }

    public SSLContactSingleResponse createSSLContact(SSLContactCreateRequest body) throws ClientException {
        return wrapRequest(post("/ssl/contacts", body)).object(SSLContactSingleResponse.class);
    }

    public SSLContactListResponse getSSLContacts() throws ClientException {
        return wrapRequest(get("/ssl/contacts")).object(SSLContactListResponse.class);
    }

    public SSLContactListResponse getSSLContacts(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/ssl/contacts").query(params)).object(SSLContactListResponse.class);
    }

    public SSLOrganisationSingleResponse createSSLOrganisation(SSLOrganisationCreateRequest body) throws ClientException {
        return wrapRequest(post("/ssl/organisations", body)).object(SSLOrganisationSingleResponse.class);
    }

    public SSLOrganisationListResponse getSSLOrganisations() throws ClientException {
        return wrapRequest(get("/ssl/organisations")).object(SSLOrganisationListResponse.class);
    }

    public SSLOrganisationListResponse getSSLOrganisations(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/ssl/organisations").query(params)).object(SSLOrganisationListResponse.class);
    }

    public SSLTypeSingleResponse getSSLType(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/ssl/types/"+id)).object(SSLTypeSingleResponse.class);
    }

    public SSLContactSingleResponse getSSLContact(String id) throws ClientException {
        return wrapRequest(get("/ssl/contacts/"+id)).object(SSLContactSingleResponse.class);
    }

    public EmptyResponse deleteSSLContact(String id) throws ClientException {
        return wrapRequest(delete("/ssl/contacts/"+id)).object(EmptyResponse.class);
    }

    public PleskLicenseSingleResponse createPleskLicense(PleskLicenseCreateRequest body) throws ClientException {
        return wrapRequest(post("/licenses/plesk", body)).object(PleskLicenseSingleResponse.class);
    }

    public PleskLicenseListResponse getPleskLicenses() throws ClientException {
        return wrapRequest(get("/licenses/plesk")).object(PleskLicenseListResponse.class);
    }

    public PleskLicenseListResponse getPleskLicenses(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/licenses/plesk").query(params)).object(PleskLicenseListResponse.class);
    }

    public SSLTypeListResponse getSSLTypes() throws ClientException {
        return wrapRequest(get("/ssl/types")).object(SSLTypeListResponse.class);
    }

    public SSLTypeListResponse getSSLTypes(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/ssl/types").query(params)).object(SSLTypeListResponse.class);
    }

    public PleskLicenseSingleResponse getPleskLicense(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/licenses/plesk/"+id)).object(PleskLicenseSingleResponse.class);
    }

    public PleskLicenseSingleResponse updatePleskLicense(java.util.UUID id, PleskLicenseUpdateRequest body) throws ClientException {
        return wrapRequest(put("/licenses/plesk/"+id, body)).object(PleskLicenseSingleResponse.class);
    }

    public PleskLicenseTypeSingleResponse getPleskLicenseType(String id) throws ClientException {
        return wrapRequest(get("/license/plesk-types/"+id)).object(PleskLicenseTypeSingleResponse.class);
    }


}