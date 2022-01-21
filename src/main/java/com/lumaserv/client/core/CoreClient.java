package com.lumaserv.client.core;

import org.javawebstack.httpclient.HTTPClient;

public class CoreClient extends HttpClient {
    public CoreClient(String apiKey, String baseUrl) {
        bearer(apiKey);
        setBaseUrl(baseUrl);
    }

    public CoreClient(String apiKey) {
        this(apiKey, "https://api.lumaserv.cloud");
    }

    public SSHKeySingleResponse createSSHKey(SSHKeyCreateRequest body) {
        return post("/ssh-keys", body).object(SSHKeySingleResponse.class);
    }

    public SSHKeyListResponse getSSHKeys() {
        return get("/ssh-keys").object(SSHKeyListResponse.class);
    }

    public SSHKeyListResponse getSSHKeys(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels, String filter[title]) {
        return get("/ssh-keys").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).query("filter[title]", filter[title]).object(SSHKeyListResponse.class);
    }

    public EmptyResponse startServer(String id) {
        return post("/servers/"+id+"/start").object(EmptyResponse.class);
    }

    public AvailabilityZoneSingleResponse createAvailabilityZone(AvailabilityZoneCreateRequest body) {
        return post("/availability-zones", body).object(AvailabilityZoneSingleResponse.class);
    }

    public AvailabilityZoneListResponse getAvailabilityZones() {
        return get("/availability-zones").object(AvailabilityZoneListResponse.class);
    }

    public AvailabilityZoneListResponse getAvailabilityZones(int page, int pageSize, String search, String filter[title]) {
        return get("/availability-zones").query("page", page).query("page_size", pageSize).query("search", search).query("filter[title]", filter[title]).object(AvailabilityZoneListResponse.class);
    }

    public ServerTemplateSingleResponse getServerTemplate(String id) {
        return get("/server-templates/"+id).object(ServerTemplateSingleResponse.class);
    }

    public EmptyResponse shutdownServer(String id) {
        return post("/servers/"+id+"/shutdown").object(EmptyResponse.class);
    }

    public EmptyResponse shutdownServer(String id, boolean force) {
        return post("/servers/"+id+"/shutdown").query("force", force).object(EmptyResponse.class);
    }

    public ServerSingleResponse getServer(String id) {
        return get("/servers/"+id).object(ServerSingleResponse.class);
    }

    public EmptyResponse deleteServer(String id) {
        return delete("/servers/"+id).object(EmptyResponse.class);
    }

    public ServerSingleResponse updateServer(String id, ServerUpdateRequest body) {
        return put("/servers/"+id, body).object(ServerSingleResponse.class);
    }

    public ServerStorageClassSingleResponse getServerStorageClass(String id) {
        return get("/server-storage-classes/"+id).object(ServerStorageClassSingleResponse.class);
    }

    public SSLOrganisationSingleResponse getSSLOrganisation(String id) {
        return get("/ssl/organisations/"+id).object(SSLOrganisationSingleResponse.class);
    }

    public EmptyResponse deleteSSLOrganisation(String id) {
        return delete("/ssl/organisations/"+id).object(EmptyResponse.class);
    }

    public ServerActionSingleResponse getServerAction(String id, String action_id) {
        return get("/servers/"+id+"/actions/"+action_id).object(ServerActionSingleResponse.class);
    }

    public SSLContactSingleResponse getSSLContact(String id) {
        return get("/ssl/contacts/"+id).object(SSLContactSingleResponse.class);
    }

    public EmptyResponse deleteSSLContact(String id) {
        return delete("/ssl/contacts/"+id).object(EmptyResponse.class);
    }

    public DNSZoneListResponse getDNSZones() {
        return get("/dns/zones").object(DNSZoneListResponse.class);
    }

    public DNSZoneListResponse getDNSZones(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels) {
        return get("/dns/zones").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).object(DNSZoneListResponse.class);
    }

    public EmptyResponse recreateServer(String id) {
        return post("/servers/"+id+"/recreate").object(EmptyResponse.class);
    }

    public EmptyResponse sendDomainVerification(String name) {
        return post("/domains/"+name+"/verification").object(EmptyResponse.class);
    }

    public DomainCheckVerificationResponse checkDomainVerification(String name) {
        return get("/domains/"+name+"/verification").object(DomainCheckVerificationResponse.class);
    }

    public ServerHostSingleResponse createServerHost(ServerHostCreateRequest body) {
        return post("/server-hosts", body).object(ServerHostSingleResponse.class);
    }

    public ServerHostListResponse getServerHosts() {
        return get("/server-hosts").object(ServerHostListResponse.class);
    }

    public ServerHostListResponse getServerHosts(int page, int pageSize, String search) {
        return get("/server-hosts").query("page", page).query("page_size", pageSize).query("search", search).object(ServerHostListResponse.class);
    }

    public ServerSingleResponse createServer(ServerCreateRequest body) {
        return post("/servers", body).object(ServerSingleResponse.class);
    }

    public ServerListResponse getServers() {
        return get("/servers").object(ServerListResponse.class);
    }

    public ServerListResponse getServers(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels, String filter[name]) {
        return get("/servers").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).query("filter[name]", filter[name]).object(ServerListResponse.class);
    }

    public EmptyResponse deleteServerNetwork(String id, String network_id) {
        return delete("/servers/"+id+"/networks/"+network_id).object(EmptyResponse.class);
    }

    public DomainCheckResponse checkDomain(String name) {
        return get("/domains/"+name+"/check").object(DomainCheckResponse.class);
    }

    public DomainSingleResponse getDomain(String name) {
        return get("/domains/"+name).object(DomainSingleResponse.class);
    }

    public EmptyResponse deleteDomain(String name) {
        return delete("/domains/"+name).object(EmptyResponse.class);
    }

    public DomainSingleResponse updateDomain(String name, DomainUpdateRequest body) {
        return put("/domains/"+name, body).object(DomainSingleResponse.class);
    }

    public DomainHandleSingleResponse getDomainHandle(String code) {
        return get("/domain-handles/"+code).object(DomainHandleSingleResponse.class);
    }

    public EmptyResponse deleteDomainHandle(String code) {
        return delete("/domain-handles/"+code).object(EmptyResponse.class);
    }

    public DomainHandleSingleResponse updateDomainHandle(String code, DomainHandleUpdateRequest body) {
        return put("/domain-handles/"+code, body).object(DomainHandleSingleResponse.class);
    }

    public AvailabilityZoneSingleResponse getAvailabilityZone(String id, AvailabilityZoneUpdateRequest body) {
        return get("/availability-zones/"+id, body).object(AvailabilityZoneSingleResponse.class);
    }

    public AvailabilityZoneSingleResponse updateAvailabilityZone(String id) {
        return put("/availability-zones/"+id).object(AvailabilityZoneSingleResponse.class);
    }

    public SubnetSingleResponse createSubnet(SubnetCreateRequest body) {
        return post("/subnets", body).object(SubnetSingleResponse.class);
    }

    public SubnetListResponse getSubnets() {
        return get("/subnets").object(SubnetListResponse.class);
    }

    public SubnetListResponse getSubnets(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels) {
        return get("/subnets").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).object(SubnetListResponse.class);
    }

    public ServerVolumeListResponse getServerVolumes() {
        return get("/server-volumes").object(ServerVolumeListResponse.class);
    }

    public ServerVolumeListResponse getServerVolumes(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels, String filter[serverId]) {
        return get("/server-volumes").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).query("filter[server_id]", filter[serverId]).object(ServerVolumeListResponse.class);
    }

    public PleskLicenseTypeSingleResponse getPleskLicenseType(String id) {
        return get("/licenses/plesk-types/"+id).object(PleskLicenseTypeSingleResponse.class);
    }

    public ServerStorageClassSingleResponse createServerStorageClass(ServerStorageClassCreateRequest body) {
        return post("/server-storage-classes", body).object(ServerStorageClassSingleResponse.class);
    }

    public ServerStorageClassListResponse getServerVolumeClasses() {
        return get("/server-storage-classes").object(ServerStorageClassListResponse.class);
    }

    public ServerStorageClassListResponse getServerVolumeClasses(int page, int pageSize, String search) {
        return get("/server-storage-classes").query("page", page).query("page_size", pageSize).query("search", search).object(ServerStorageClassListResponse.class);
    }

    public SearchResponse search() {
        return get("/search").object(SearchResponse.class);
    }

    public SearchResponse search(boolean withLabels, String resources, String search, int limit, String projectId, String labels[:name]) {
        return get("/search").query("with_labels", withLabels).query("resources", resources).query("search", search).query("limit", limit).query("project_id", projectId).query("labels[:name]", labels[:name]).object(SearchResponse.class);
    }

    public S3BucketSingleResponse createS3Bucket(S3BucketCreateRequest body) {
        return post("/storage/s3/buckets", body).object(S3BucketSingleResponse.class);
    }

    public S3BucketListResponse getS3Buckets() {
        return get("/storage/s3/buckets").object(S3BucketListResponse.class);
    }

    public S3BucketListResponse getS3Buckets(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels) {
        return get("/storage/s3/buckets").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).object(S3BucketListResponse.class);
    }

    public PleskLicenseTypeListResponse getPleskLicenseTypes() {
        return get("/licenses/plesk-types").object(PleskLicenseTypeListResponse.class);
    }

    public PleskLicenseTypeListResponse getPleskLicenseTypes(int page, int pageSize, String search) {
        return get("/licenses/plesk-types").query("page", page).query("page_size", pageSize).query("search", search).object(PleskLicenseTypeListResponse.class);
    }

    public ServerActionListResponse getServerActions(String id) {
        return get("/servers/"+id+"/actions").object(ServerActionListResponse.class);
    }

    public ServerActionListResponse getServerActions(String id, int page, int pageSize, String search) {
        return get("/servers/"+id+"/actions").query("page", page).query("page_size", pageSize).query("search", search).object(ServerActionListResponse.class);
    }

    public ServerStatusResponse getServerStatus(String id) {
        return get("/servers/"+id+"/status").object(ServerStatusResponse.class);
    }

    public SSLOrganisationSingleResponse createSSLOrganisation(SSLOrganisationCreateRequest body) {
        return post("/ssl/organisations", body).object(SSLOrganisationSingleResponse.class);
    }

    public SSLOrganisationListResponse getSSLOrganisations() {
        return get("/ssl/organisations").object(SSLOrganisationListResponse.class);
    }

    public SSLOrganisationListResponse getSSLOrganisations(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels) {
        return get("/ssl/organisations").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).object(SSLOrganisationListResponse.class);
    }

    public SSLTypeSingleResponse getSSLType(String id) {
        return get("/ssl/types/"+id).object(SSLTypeSingleResponse.class);
    }

    public SSLTypeListResponse getSSLTypes() {
        return get("/ssl/types").object(SSLTypeListResponse.class);
    }

    public SSLTypeListResponse getSSLTypes(int page, int pageSize, String search) {
        return get("/ssl/types").query("page", page).query("page_size", pageSize).query("search", search).object(SSLTypeListResponse.class);
    }

    public EmptyResponse deleteDNSRecord(String name, String id) {
        return delete("/dns/zones/"+name+"/records/"+id).object(EmptyResponse.class);
    }

    public DNSRecordSingleResponse updateDNSRecord(String name, String id, DNSRecordUpdateRequest body) {
        return put("/dns/zones/"+name+"/records/"+id, body).object(DNSRecordSingleResponse.class);
    }

    public PleskLicenseSingleResponse getPleskLicense(String id) {
        return get("/licenses/plesk/"+id).object(PleskLicenseSingleResponse.class);
    }

    public PleskLicenseSingleResponse updatePleskLicense(String id, PleskLicenseUpdateRequest body) {
        return put("/licenses/plesk/"+id, body).object(PleskLicenseSingleResponse.class);
    }

    public ServerTemplateSingleResponse createServerTemplate(ServerTemplateCreateRequest body) {
        return post("/server-templates", body).object(ServerTemplateSingleResponse.class);
    }

    public ServerTemplateListResponse getServerTemplates() {
        return get("/server-templates").object(ServerTemplateListResponse.class);
    }

    public ServerTemplateListResponse getServerTemplates(int page, int pageSize, String search, String filter[title]) {
        return get("/server-templates").query("page", page).query("page_size", pageSize).query("search", search).query("filter[title]", filter[title]).object(ServerTemplateListResponse.class);
    }

    public ServerHostSingleResponse getServerHost(String id) {
        return get("/server-hosts/"+id).object(ServerHostSingleResponse.class);
    }

    public DomainSingleResponse unscheduleDomainDelete(String name) {
        return post("/domains/"+name+"/unschedule-delete").object(DomainSingleResponse.class);
    }

    public EmptyResponse stopServer(String id) {
        return post("/servers/"+id+"/stop").object(EmptyResponse.class);
    }

    public DNSRecordSingleResponse createDNSZoneRecord(String name, DNSRecordCreateRequest body) {
        return post("/dns/zones/"+name+"/records", body).object(DNSRecordSingleResponse.class);
    }

    public DNSRecordListResponse getDNSZoneRecords(String name) {
        return get("/dns/zones/"+name+"/records").object(DNSRecordListResponse.class);
    }

    public DNSRecordListResponse getDNSZoneRecords(String name, int page, int pageSize) {
        return get("/dns/zones/"+name+"/records").query("page", page).query("page_size", pageSize).object(DNSRecordListResponse.class);
    }

    public DNSRecordListResponse updateDNSZoneRecords(String name, DNSRecordsUpdateRequest body) {
        return put("/dns/zones/"+name+"/records", body).object(DNSRecordListResponse.class);
    }

    public ServerVolumeSingleResponse getServerVolume(String id) {
        return get("/server-volumes/"+id).object(ServerVolumeSingleResponse.class);
    }

    public ServerNetworkSingleResponse createServerNetwork(String id, ServerNetworkCreateRequest body) {
        return post("/servers/"+id+"/networks", body).object(ServerNetworkSingleResponse.class);
    }

    public ServerNetworkListResponse getServerNetworks(String id) {
        return get("/servers/"+id+"/networks").object(ServerNetworkListResponse.class);
    }

    public ServerNetworkListResponse getServerNetworks(String id, int page, int pageSize, String search) {
        return get("/servers/"+id+"/networks").query("page", page).query("page_size", pageSize).query("search", search).object(ServerNetworkListResponse.class);
    }

    public ServerVariantSingleResponse createServerVariant(ServerVariantCreateRequest body) {
        return post("/server-variants", body).object(ServerVariantSingleResponse.class);
    }

    public ServerVariantListResponse getServerVariants() {
        return get("/server-variants").object(ServerVariantListResponse.class);
    }

    public ServerVariantListResponse getServerVariants(int page, int pageSize, String search, String filter[title]) {
        return get("/server-variants").query("page", page).query("page_size", pageSize).query("search", search).query("filter[title]", filter[title]).object(ServerVariantListResponse.class);
    }

    public ServerStorageSingleResponse getServerStorage(String id) {
        return get("/server-storages/"+id).object(ServerStorageSingleResponse.class);
    }

    public SSHKeySingleResponse getSSHKey(String id) {
        return get("/ssh-keys/"+id).object(SSHKeySingleResponse.class);
    }

    public EmptyResponse deleteSSHKey(String id) {
        return delete("/ssh-keys/"+id).object(EmptyResponse.class);
    }

    public ServerVariantSingleResponse getServerVariant(String id) {
        return get("/server-variants/"+id).object(ServerVariantSingleResponse.class);
    }

    public EmptyResponse deleteServerVariant(String id) {
        return delete("/server-variants/"+id).object(EmptyResponse.class);
    }

    public EmptyResponse deleteS3AccessKeyGrant(String access_key_id, String id) {
        return delete("/storage/s3/access-keys/"+access_key_id+"/grants/"+id).object(EmptyResponse.class);
    }

    public ServerMediaSingleResponse createServerMedia(ServerMediaCreateRequest body) {
        return post("/server-medias", body).object(ServerMediaSingleResponse.class);
    }

    public ServerMediaListResponse getServerMedias() {
        return get("/server-medias").object(ServerMediaListResponse.class);
    }

    public ServerMediaListResponse getServerMedias(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels, String filter[title]) {
        return get("/server-medias").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).query("filter[title]", filter[title]).object(ServerMediaListResponse.class);
    }

    public SubnetSingleResponse getSubnet(String id) {
        return get("/subnets/"+id).object(SubnetSingleResponse.class);
    }

    public EmptyResponse deleteSubnet(String id) {
        return delete("/subnets/"+id).object(EmptyResponse.class);
    }

    public ServerVolumeSingleResponse attachServerVolume(String id, ServerVolumeAttachRequest body) {
        return post("/server-volumes/"+id+"/attach", body).object(ServerVolumeSingleResponse.class);
    }

    public PleskLicenseSingleResponse createPleskLicense(PleskLicenseCreateRequest body) {
        return post("/licenses/plesk", body).object(PleskLicenseSingleResponse.class);
    }

    public PleskLicenseListResponse getPleskLicenses() {
        return get("/licenses/plesk").object(PleskLicenseListResponse.class);
    }

    public PleskLicenseListResponse getPleskLicenses(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels, String filter[typeId]) {
        return get("/licenses/plesk").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).query("filter[type_id]", filter[typeId]).object(PleskLicenseListResponse.class);
    }

    public S3AccessKeySingleResponse getS3AccessKey(String id) {
        return get("/storage/s3/access-keys/"+id).object(S3AccessKeySingleResponse.class);
    }

    public EmptyResponse deleteS3AccessKey(String id) {
        return delete("/storage/s3/access-keys/"+id).object(EmptyResponse.class);
    }

    public S3AccessKeySingleResponse createS3AccessKey(S3AccessKeyCreateRequest body) {
        return post("/storage/s3/access-keys", body).object(S3AccessKeySingleResponse.class);
    }

    public S3AccessKeyListResponse getS3AccessKeys() {
        return get("/storage/s3/access-keys").object(S3AccessKeyListResponse.class);
    }

    public S3AccessKeyListResponse getS3AccessKeys(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels) {
        return get("/storage/s3/access-keys").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).object(S3AccessKeyListResponse.class);
    }

    public DNSZoneSingleResponse getDNSZone(String name) {
        return get("/dns/zones/"+name).object(DNSZoneSingleResponse.class);
    }

    public DNSZoneSingleResponse updateDNSZone(String name, DNSZoneUpdateRequest body) {
        return put("/dns/zones/"+name, body).object(DNSZoneSingleResponse.class);
    }

    public DomainHandleSingleResponse createDomainHandle(DomainHandleCreateRequest body) {
        return post("/domain-handles", body).object(DomainHandleSingleResponse.class);
    }

    public DomainHandleListResponse getDomainHandles() {
        return get("/domain-handles").object(DomainHandleListResponse.class);
    }

    public DomainHandleListResponse getDomainHandles(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels) {
        return get("/domain-handles").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).object(DomainHandleListResponse.class);
    }

    public SSLCertificateSingleResponse createSSLCertificate(SSLCertificateCreateRequest body) {
        return post("/ssl/certificates", body).object(SSLCertificateSingleResponse.class);
    }

    public SSLCertificateListResponse getSSLCertificates() {
        return get("/ssl/certificates").object(SSLCertificateListResponse.class);
    }

    public SSLCertificateListResponse getSSLCertificates(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels, String filter[typeId], String filter[organisationId], String filter[adminContactId], String filter[techContactId]) {
        return get("/ssl/certificates").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).query("filter[type_id]", filter[typeId]).query("filter[organisation_id]", filter[organisationId]).query("filter[admin_contact_id]", filter[adminContactId]).query("filter[tech_contact_id]", filter[techContactId]).object(SSLCertificateListResponse.class);
    }

    public DomainSingleResponse scheduleDomainDelete(String name, DomainScheduleDeleteRequest body) {
        return post("/domains/"+name+"/schedule-delete", body).object(DomainSingleResponse.class);
    }

    public DomainPriceListResponse getDomainPricingList() {
        return get("/pricing/domains").object(DomainPriceListResponse.class);
    }

    public DomainPriceListResponse getDomainPricingList(String projectId) {
        return get("/pricing/domains").query("project_id", projectId).object(DomainPriceListResponse.class);
    }

    public SSLCertificateSingleResponse getSSLCertificate(String id) {
        return get("/ssl/certificates/"+id).object(SSLCertificateSingleResponse.class);
    }

    public AddressSingleResponse createSubnetAddress(String id, SubnetAddressCreateRequest body) {
        return post("/subnets/"+id+"/addresses", body).object(AddressSingleResponse.class);
    }

    public NetworkSingleResponse createNetwork(NetworkCreateRequest body) {
        return post("/networks", body).object(NetworkSingleResponse.class);
    }

    public NetworkListResponse getNetworks() {
        return get("/networks").object(NetworkListResponse.class);
    }

    public NetworkListResponse getNetworks(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels, String filter[title]) {
        return get("/networks").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).query("filter[title]", filter[title]).object(NetworkListResponse.class);
    }

    public DomainAuthinfoResponse getDomainAuthinfo(String name) {
        return get("/domains/"+name+"/authinfo").object(DomainAuthinfoResponse.class);
    }

    public EmptyResponse removeDomainAuthinfo(String name) {
        return delete("/domains/"+name+"/authinfo").object(EmptyResponse.class);
    }

    public ServerStorageSingleResponse createServerStorage(ServerStorageCreateRequest body) {
        return post("/server-storages", body).object(ServerStorageSingleResponse.class);
    }

    public ServerStorageListResponse getServerStorages() {
        return get("/server-storages").object(ServerStorageListResponse.class);
    }

    public EmptyResponse restoreDomain(String name) {
        return post("/domains/"+name+"/restore").object(EmptyResponse.class);
    }

    public SSLContactSingleResponse createSSLContact(SSLContactCreateRequest body) {
        return post("/ssl/contacts", body).object(SSLContactSingleResponse.class);
    }

    public SSLContactListResponse getSSLContacts() {
        return get("/ssl/contacts").object(SSLContactListResponse.class);
    }

    public SSLContactListResponse getSSLContacts(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels) {
        return get("/ssl/contacts").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).object(SSLContactListResponse.class);
    }

    public ServerMediaSingleResponse getServerMedia(String id) {
        return get("/server-medias/"+id).object(ServerMediaSingleResponse.class);
    }

    public EmptyResponse deleteServerMedia(String id) {
        return delete("/server-medias/"+id).object(EmptyResponse.class);
    }

    public S3AccessGrantSingleResponse createS3AccessKeyGrant(String access_key_id, S3AccessGrantCreateRequest body) {
        return post("/storage/s3/access-keys/"+access_key_id+"/grants", body).object(S3AccessGrantSingleResponse.class);
    }

    public S3AccessGrantListResponse getS3AccessKeyGrants(String access_key_id) {
        return get("/storage/s3/access-keys/"+access_key_id+"/grants").object(S3AccessGrantListResponse.class);
    }

    public S3AccessGrantListResponse getS3AccessKeyGrants(String access_key_id, int page, int pageSize, String search, String filter[labels][:name], boolean withLabels) {
        return get("/storage/s3/access-keys/"+access_key_id+"/grants").query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).object(S3AccessGrantListResponse.class);
    }

    public ServerVNCResponse getServerVNC(String id) {
        return get("/servers/"+id+"/vnc").object(ServerVNCResponse.class);
    }

    public NetworkSingleResponse getNetwork(String id) {
        return get("/networks/"+id).object(NetworkSingleResponse.class);
    }

    public S3BucketSingleResponse getS3Bucket(String id) {
        return get("/storage/s3/buckets/"+id).object(S3BucketSingleResponse.class);
    }

    public EmptyResponse deleteS3Bucket(String id) {
        return delete("/storage/s3/buckets/"+id).object(EmptyResponse.class);
    }

    public DomainSingleResponse createDomain(DomainCreateRequest body) {
        return post("/domains", body).object(DomainSingleResponse.class);
    }

    public DomainListResponse getDomains() {
        return get("/domains").object(DomainListResponse.class);
    }

    public DomainListResponse getDomains(String filter[projectId], int page, int pageSize, String search, String filter[labels][:name], boolean withLabels, String filter[ownerHandleCode], String filter[adminHandleCode], String filter[techHandleCode], String filter[zoneHandleCode], String filter[tld]) {
        return get("/domains").query("filter[project_id]", filter[projectId]).query("page", page).query("page_size", pageSize).query("search", search).query("filter[labels][:name]", filter[labels][:name]).query("with_labels", withLabels).query("filter[owner_handle_code]", filter[ownerHandleCode]).query("filter[admin_handle_code]", filter[adminHandleCode]).query("filter[tech_handle_code]", filter[techHandleCode]).query("filter[zone_handle_code]", filter[zoneHandleCode]).query("filter[tld]", filter[tld]).object(DomainListResponse.class);
    }

    public ServerVolumeSingleResponse detachServerVolume(String id) {
        return post("/server-volumes/"+id+"/detach").object(ServerVolumeSingleResponse.class);
    }


}