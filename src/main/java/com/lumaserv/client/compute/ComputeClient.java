package com.lumaserv.client.compute;

import org.javawebstack.httpclient.HTTPClient;
import org.javawebstack.httpclient.HTTPRequest;

public class ComputeClient extends HTTPClient {
    public ComputeClient(String apiKey, String baseUrl) {
        bearer(apiKey);
        setBaseUrl(baseUrl);
    }

    public ComputeClient(String apiKey) {
        this(apiKey, "https://api.lumaserv.com/compute");
    }

    private HTTPRequest wrapRequest(HTTPRequest r) throws ClientException {
        if(r.status() < 200 || (r.status() >= 300 && r.status() < 400))
            throw new ClientException(r);
        return r;
    }

    public SSHKeySingleResponse createSSHKey(SSHKeyCreateRequest body) throws ClientException {
        return wrapRequest(post("/ssh-keys", body)).object(SSHKeySingleResponse.class);
    }

    public SSHKeyListResponse getSSHKeys() throws ClientException {
        return wrapRequest(get("/ssh-keys")).object(SSHKeyListResponse.class);
    }

    public SSHKeyListResponse getSSHKeys(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/ssh-keys").query(params)).object(SSHKeyListResponse.class);
    }

    public ServerPriceRangeSingleResponse createServerPriceRange(ServerPriceRangeCreateRequest body) throws ClientException {
        return wrapRequest(post("/server-price-ranges", body)).object(ServerPriceRangeSingleResponse.class);
    }

    public ServerPriceRangeListResponse getServerPriceRanges() throws ClientException {
        return wrapRequest(get("/server-price-ranges")).object(ServerPriceRangeListResponse.class);
    }

    public ServerPriceRangeListResponse getServerPriceRanges(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-price-ranges").query(params)).object(ServerPriceRangeListResponse.class);
    }

    public EmptyResponse startServer(java.util.UUID id) throws ClientException {
        return wrapRequest(post("/servers/"+id+"/start")).object(EmptyResponse.class);
    }

    public AvailabilityZoneSingleResponse createAvailabilityZone(AvailabilityZoneCreateRequest body) throws ClientException {
        return wrapRequest(post("/availability-zones", body)).object(AvailabilityZoneSingleResponse.class);
    }

    public AvailabilityZoneListResponse getAvailabilityZones() throws ClientException {
        return wrapRequest(get("/availability-zones")).object(AvailabilityZoneListResponse.class);
    }

    public AvailabilityZoneListResponse getAvailabilityZones(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/availability-zones").query(params)).object(AvailabilityZoneListResponse.class);
    }

    public ServerTemplateSingleResponse getServerTemplate(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/server-templates/"+id)).object(ServerTemplateSingleResponse.class);
    }

    public EmptyResponse shutdownServer(java.util.UUID id) throws ClientException {
        return wrapRequest(post("/servers/"+id+"/shutdown")).object(EmptyResponse.class);
    }

    public EmptyResponse shutdownServer(java.util.UUID id, java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(post("/servers/"+id+"/shutdown").query(params)).object(EmptyResponse.class);
    }

    public ServerFirewallSingleResponse getServerFirewall(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/server-firewalls/"+id)).object(ServerFirewallSingleResponse.class);
    }

    public EmptyResponse deleteServerFirewall(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/server-firewalls/"+id)).object(EmptyResponse.class);
    }

    public ServerSingleResponse getServer(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/servers/"+id)).object(ServerSingleResponse.class);
    }

    public EmptyResponse deleteServer(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/servers/"+id)).object(EmptyResponse.class);
    }

    public ServerSingleResponse updateServer(java.util.UUID id, ServerUpdateRequest body) throws ClientException {
        return wrapRequest(put("/servers/"+id, body)).object(ServerSingleResponse.class);
    }

    public ServerActionListResponse getServerActions() throws ClientException {
        return wrapRequest(get("/server-actions")).object(ServerActionListResponse.class);
    }

    public ServerActionListResponse getServerActions(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-actions").query(params)).object(ServerActionListResponse.class);
    }

    public ServerStorageClassSingleResponse getServerStorageClass(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/server-storage-classes/"+id)).object(ServerStorageClassSingleResponse.class);
    }

    public ServerActionSingleResponse restartServer(String id) throws ClientException {
        return wrapRequest(post("/servers/"+id+"/restart")).object(ServerActionSingleResponse.class);
    }

    public ServerSingleResponse mountServerMedia(java.util.UUID id, ServerMediaMountRequest body) throws ClientException {
        return wrapRequest(post("/servers/"+id+"/mount", body)).object(ServerSingleResponse.class);
    }

    public ServerSingleResponse unmountServerMedia(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/servers/"+id+"/mount")).object(ServerSingleResponse.class);
    }

    public ScheduledServerActionSingleResponse restoreServer(String id, ServerRestoreRequest body) throws ClientException {
        return wrapRequest(post("/servers/"+id+"/restore", body)).object(ScheduledServerActionSingleResponse.class);
    }

    public ServerGraphResponse getServerGraph(String id) throws ClientException {
        return wrapRequest(get("/servers/"+id+"/graph")).object(ServerGraphResponse.class);
    }

    public ServerGraphResponse getServerGraph(String id, java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/servers/"+id+"/graph").query(params)).object(ServerGraphResponse.class);
    }

    public EmptyResponse recreateServer(java.util.UUID id) throws ClientException {
        return wrapRequest(post("/servers/"+id+"/recreate")).object(EmptyResponse.class);
    }

    public ServerFirewallSingleResponse createServerFirewall(ServerFirewallCreateRequest body) throws ClientException {
        return wrapRequest(post("/server-firewalls", body)).object(ServerFirewallSingleResponse.class);
    }

    public ServerFirewallListResponse getServerFirewalls() throws ClientException {
        return wrapRequest(get("/server-firewalls")).object(ServerFirewallListResponse.class);
    }

    public ServerFirewallListResponse getServerFirewalls(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-firewalls").query(params)).object(ServerFirewallListResponse.class);
    }

    public ServerFirewallRuleSingleResponse getServerFirewallRule(java.util.UUID id, java.util.UUID rule_id) throws ClientException {
        return wrapRequest(get("/server-firewalls/"+id+"/rules/"+rule_id)).object(ServerFirewallRuleSingleResponse.class);
    }

    public EmptyResponse deleteServerFirewallRule(java.util.UUID id, java.util.UUID rule_id) throws ClientException {
        return wrapRequest(delete("/server-firewalls/"+id+"/rules/"+rule_id)).object(EmptyResponse.class);
    }

    public ServerFirewallRuleSingleResponse updateServerFirewallRule(java.util.UUID id, java.util.UUID rule_id, ServerFirewallRuleUpdateRequest body) throws ClientException {
        return wrapRequest(put("/server-firewalls/"+id+"/rules/"+rule_id, body)).object(ServerFirewallRuleSingleResponse.class);
    }

    public ServerHostSingleResponse createServerHost(ServerHostCreateRequest body) throws ClientException {
        return wrapRequest(post("/server-hosts", body)).object(ServerHostSingleResponse.class);
    }

    public ServerHostListResponse getServerHosts() throws ClientException {
        return wrapRequest(get("/server-hosts")).object(ServerHostListResponse.class);
    }

    public ServerHostListResponse getServerHosts(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-hosts").query(params)).object(ServerHostListResponse.class);
    }

    public ServerSingleResponse createServer(ServerCreateRequest body) throws ClientException {
        return wrapRequest(post("/servers", body)).object(ServerSingleResponse.class);
    }

    public ServerListResponse getServers() throws ClientException {
        return wrapRequest(get("/servers")).object(ServerListResponse.class);
    }

    public ServerListResponse getServers(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/servers").query(params)).object(ServerListResponse.class);
    }

    public EmptyResponse deleteServerNetwork(java.util.UUID id, java.util.UUID network_id) throws ClientException {
        return wrapRequest(delete("/servers/"+id+"/networks/"+network_id)).object(EmptyResponse.class);
    }

    public AvailabilityZoneSingleResponse getAvailabilityZone(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/availability-zones/"+id)).object(AvailabilityZoneSingleResponse.class);
    }

    public AvailabilityZoneSingleResponse updateAvailabilityZone(java.util.UUID id, AvailabilityZoneUpdateRequest body) throws ClientException {
        return wrapRequest(put("/availability-zones/"+id, body)).object(AvailabilityZoneSingleResponse.class);
    }

    public ServerBackupSingleResponse createServerBackup(ServerBackupCreateRequest body) throws ClientException {
        return wrapRequest(post("/server-backups", body)).object(ServerBackupSingleResponse.class);
    }

    public ServerBackupListResponse getServerBackups() throws ClientException {
        return wrapRequest(get("/server-backups")).object(ServerBackupListResponse.class);
    }

    public ServerBackupListResponse getServerBackups(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-backups").query(params)).object(ServerBackupListResponse.class);
    }

    public SubnetSingleResponse createSubnet(SubnetCreateRequest body) throws ClientException {
        return wrapRequest(post("/subnets", body)).object(SubnetSingleResponse.class);
    }

    public SubnetListResponse getSubnets() throws ClientException {
        return wrapRequest(get("/subnets")).object(SubnetListResponse.class);
    }

    public SubnetListResponse getSubnets(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/subnets").query(params)).object(SubnetListResponse.class);
    }

    public ServerVolumeSingleResponse createServerVolume(ServerVolumeCreateRequest body) throws ClientException {
        return wrapRequest(post("/server-volumes", body)).object(ServerVolumeSingleResponse.class);
    }

    public ServerVolumeListResponse getServerVolumes() throws ClientException {
        return wrapRequest(get("/server-volumes")).object(ServerVolumeListResponse.class);
    }

    public ServerVolumeListResponse getServerVolumes(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-volumes").query(params)).object(ServerVolumeListResponse.class);
    }

    public PleskLicenseTypeSingleResponse getPleskLicenseType(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/licenses/plesk-types/"+id)).object(PleskLicenseTypeSingleResponse.class);
    }

    public ServerStorageClassSingleResponse createServerStorageClass(ServerStorageClassCreateRequest body) throws ClientException {
        return wrapRequest(post("/server-storage-classes", body)).object(ServerStorageClassSingleResponse.class);
    }

    public ServerStorageClassListResponse getServerStorageClasses() throws ClientException {
        return wrapRequest(get("/server-storage-classes")).object(ServerStorageClassListResponse.class);
    }

    public ServerStorageClassListResponse getServerStorageClasses(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-storage-classes").query(params)).object(ServerStorageClassListResponse.class);
    }

    public ServerFirewallMemberSingleResponse getServerFirewallMember(java.util.UUID id, java.util.UUID member_id) throws ClientException {
        return wrapRequest(get("/server-firewalls/"+id+"/members/"+member_id)).object(ServerFirewallMemberSingleResponse.class);
    }

    public EmptyResponse deleteServerFirewallMember(java.util.UUID id, java.util.UUID member_id) throws ClientException {
        return wrapRequest(delete("/server-firewalls/"+id+"/members/"+member_id)).object(EmptyResponse.class);
    }

    public SearchResponse search() throws ClientException {
        return wrapRequest(get("/search")).object(SearchResponse.class);
    }

    public SearchResponse search(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/search").query(params)).object(SearchResponse.class);
    }

    public ScheduledServerActionSingleResponse getScheduledServerAction(java.util.UUID id, java.util.UUID action_id) throws ClientException {
        return wrapRequest(get("/servers/"+id+"/scheduled-actions/"+action_id)).object(ScheduledServerActionSingleResponse.class);
    }

    public EmptyResponse deleteScheduledServerAction(java.util.UUID id, java.util.UUID action_id) throws ClientException {
        return wrapRequest(delete("/servers/"+id+"/scheduled-actions/"+action_id)).object(EmptyResponse.class);
    }

    public ScheduledServerActionSingleResponse updateScheduledServerAction(java.util.UUID id, java.util.UUID action_id, ScheduledServerActionUpdateRequest body) throws ClientException {
        return wrapRequest(put("/servers/"+id+"/scheduled-actions/"+action_id, body)).object(ScheduledServerActionSingleResponse.class);
    }

    public S3BucketSingleResponse createS3Bucket(S3BucketCreateRequest body) throws ClientException {
        return wrapRequest(post("/storage/s3/buckets", body)).object(S3BucketSingleResponse.class);
    }

    public S3BucketListResponse getS3Buckets() throws ClientException {
        return wrapRequest(get("/storage/s3/buckets")).object(S3BucketListResponse.class);
    }

    public S3BucketListResponse getS3Buckets(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/storage/s3/buckets").query(params)).object(S3BucketListResponse.class);
    }

    public PleskLicenseTypeListResponse getPleskLicenseTypes() throws ClientException {
        return wrapRequest(get("/licenses/plesk-types")).object(PleskLicenseTypeListResponse.class);
    }

    public PleskLicenseTypeListResponse getPleskLicenseTypes(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/licenses/plesk-types").query(params)).object(PleskLicenseTypeListResponse.class);
    }

    public ServerStatusResponse getServerStatus(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/servers/"+id+"/status")).object(ServerStatusResponse.class);
    }

    public ServerFirewallMemberSingleResponse createServerFirewallMember(java.util.UUID id, ServerFirewallMemberCreateRequest body) throws ClientException {
        return wrapRequest(post("/server-firewalls/"+id+"/members", body)).object(ServerFirewallMemberSingleResponse.class);
    }

    public ServerFirewallMemberListResponse getServerFirewallMembers(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/server-firewalls/"+id+"/members")).object(ServerFirewallMemberListResponse.class);
    }

    public ServerFirewallMemberListResponse getServerFirewallMembers(java.util.UUID id, java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-firewalls/"+id+"/members").query(params)).object(ServerFirewallMemberListResponse.class);
    }

    public ServerPriceRangeSingleResponse getServerPriceRange(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/server-price-ranges/"+id)).object(ServerPriceRangeSingleResponse.class);
    }

    public ServerActionSingleResponse getServerAction(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/server-actions/"+id)).object(ServerActionSingleResponse.class);
    }

    public ServerVariantPriceSingleResponse getServerVariantPrice(java.util.UUID id, java.util.UUID variant_id) throws ClientException {
        return wrapRequest(get("/server-price-ranges/"+id+"/variant-prices/"+variant_id)).object(ServerVariantPriceSingleResponse.class);
    }

    public EmptyResponse deleteServerVariantPrice(java.util.UUID id, java.util.UUID variant_id) throws ClientException {
        return wrapRequest(delete("/server-price-ranges/"+id+"/variant-prices/"+variant_id)).object(EmptyResponse.class);
    }

    public ServerVariantPriceSingleResponse updateServerVariantPrice(java.util.UUID id, java.util.UUID variant_id, ServerVariantPriceUpdateRequest body) throws ClientException {
        return wrapRequest(put("/server-price-ranges/"+id+"/variant-prices/"+variant_id, body)).object(ServerVariantPriceSingleResponse.class);
    }

    public PleskLicenseSingleResponse getPleskLicense(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/licenses/plesk/"+id)).object(PleskLicenseSingleResponse.class);
    }

    public PleskLicenseSingleResponse updatePleskLicense(java.util.UUID id, PleskLicenseUpdateRequest body) throws ClientException {
        return wrapRequest(put("/licenses/plesk/"+id, body)).object(PleskLicenseSingleResponse.class);
    }

    public ServerTemplateSingleResponse createServerTemplate(ServerTemplateCreateRequest body) throws ClientException {
        return wrapRequest(post("/server-templates", body)).object(ServerTemplateSingleResponse.class);
    }

    public ServerTemplateListResponse getServerTemplates() throws ClientException {
        return wrapRequest(get("/server-templates")).object(ServerTemplateListResponse.class);
    }

    public ServerTemplateListResponse getServerTemplates(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-templates").query(params)).object(ServerTemplateListResponse.class);
    }

    public ServerHostSingleResponse getServerHost(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/server-hosts/"+id)).object(ServerHostSingleResponse.class);
    }

    public ServerHostSingleResponse updateServerHost(java.util.UUID id, ServerHostUpdateRequest body) throws ClientException {
        return wrapRequest(put("/server-hosts/"+id, body)).object(ServerHostSingleResponse.class);
    }

    public ServerFirewallRuleSingleResponse createServerFirewallRule(java.util.UUID id, ServerFirewallRuleCreateRequest body) throws ClientException {
        return wrapRequest(post("/server-firewalls/"+id+"/rules", body)).object(ServerFirewallRuleSingleResponse.class);
    }

    public ServerFirewallRuleListResponse getServerFirewallRules(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/server-firewalls/"+id+"/rules")).object(ServerFirewallRuleListResponse.class);
    }

    public ServerFirewallRuleListResponse getServerFirewallRules(java.util.UUID id, java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-firewalls/"+id+"/rules").query(params)).object(ServerFirewallRuleListResponse.class);
    }

    public ScheduledServerActionSingleResponse createScheduledServerAction(java.util.UUID id, ScheduledServerActionCreateRequest body) throws ClientException {
        return wrapRequest(post("/servers/"+id+"/scheduled-actions", body)).object(ScheduledServerActionSingleResponse.class);
    }

    public ScheduledServerActionListResponse getScheduledServerActions(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/servers/"+id+"/scheduled-actions")).object(ScheduledServerActionListResponse.class);
    }

    public ScheduledServerActionListResponse getScheduledServerActions(java.util.UUID id, java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/servers/"+id+"/scheduled-actions").query(params)).object(ScheduledServerActionListResponse.class);
    }

    public EmptyResponse stopServer(java.util.UUID id) throws ClientException {
        return wrapRequest(post("/servers/"+id+"/stop")).object(EmptyResponse.class);
    }

    public ServerVolumeSingleResponse getServerVolume(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/server-volumes/"+id)).object(ServerVolumeSingleResponse.class);
    }

    public EmptyResponse deleteServerVolume(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/server-volumes/"+id)).object(EmptyResponse.class);
    }

    public ServerVolumeSingleResponse updateServerVolume(java.util.UUID id, ServerVolumeUpdateRequest body) throws ClientException {
        return wrapRequest(put("/server-volumes/"+id, body)).object(ServerVolumeSingleResponse.class);
    }

    public ServerNetworkSingleResponse createServerNetwork(java.util.UUID id, ServerNetworkCreateRequest body) throws ClientException {
        return wrapRequest(post("/servers/"+id+"/networks", body)).object(ServerNetworkSingleResponse.class);
    }

    public ServerNetworkListResponse getServerNetworks(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/servers/"+id+"/networks")).object(ServerNetworkListResponse.class);
    }

    public ServerNetworkListResponse getServerNetworks(java.util.UUID id, java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/servers/"+id+"/networks").query(params)).object(ServerNetworkListResponse.class);
    }

    public ServerVariantSingleResponse createServerVariant(ServerVariantCreateRequest body) throws ClientException {
        return wrapRequest(post("/server-variants", body)).object(ServerVariantSingleResponse.class);
    }

    public ServerVariantListResponse getServerVariants() throws ClientException {
        return wrapRequest(get("/server-variants")).object(ServerVariantListResponse.class);
    }

    public ServerVariantListResponse getServerVariants(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-variants").query(params)).object(ServerVariantListResponse.class);
    }

    public ServerStorageSingleResponse getServerStorage(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/server-storages/"+id)).object(ServerStorageSingleResponse.class);
    }

    public SSHKeySingleResponse getSSHKey(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/ssh-keys/"+id)).object(SSHKeySingleResponse.class);
    }

    public EmptyResponse deleteSSHKey(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/ssh-keys/"+id)).object(EmptyResponse.class);
    }

    public ServerPriceRangeAssignmentSingleResponse createServerPriceRangeAssignment(ServerPriceRangeAssignmentCreateRequest body) throws ClientException {
        return wrapRequest(post("/server-price-range-assignments", body)).object(ServerPriceRangeAssignmentSingleResponse.class);
    }

    public ServerPriceRangeAssignmentListResponse getServerPriceRangeAssignments() throws ClientException {
        return wrapRequest(get("/server-price-range-assignments")).object(ServerPriceRangeAssignmentListResponse.class);
    }

    public ServerPriceRangeAssignmentListResponse getServerPriceRangeAssignments(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-price-range-assignments").query(params)).object(ServerPriceRangeAssignmentListResponse.class);
    }

    public AddressListResponse getAddresses() throws ClientException {
        return wrapRequest(get("/addresses")).object(AddressListResponse.class);
    }

    public AddressListResponse getAddresses(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/addresses").query(params)).object(AddressListResponse.class);
    }

    public ServerVariantSingleResponse getServerVariant(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/server-variants/"+id)).object(ServerVariantSingleResponse.class);
    }

    public EmptyResponse deleteServerVariant(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/server-variants/"+id)).object(EmptyResponse.class);
    }

    public EmptyResponse deleteS3AccessKeyGrant(java.util.UUID access_key_id, java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/storage/s3/access-keys/"+access_key_id+"/grants/"+id)).object(EmptyResponse.class);
    }

    public ServerMediaSingleResponse createServerMedia(ServerMediaCreateRequest body) throws ClientException {
        return wrapRequest(post("/server-medias", body)).object(ServerMediaSingleResponse.class);
    }

    public ServerMediaListResponse getServerMedias() throws ClientException {
        return wrapRequest(get("/server-medias")).object(ServerMediaListResponse.class);
    }

    public ServerMediaListResponse getServerMedias(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-medias").query(params)).object(ServerMediaListResponse.class);
    }

    public SubnetSingleResponse getSubnet(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/subnets/"+id)).object(SubnetSingleResponse.class);
    }

    public EmptyResponse deleteSubnet(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/subnets/"+id)).object(EmptyResponse.class);
    }

    public ServerVolumeSingleResponse attachServerVolume(java.util.UUID id, ServerVolumeAttachRequest body) throws ClientException {
        return wrapRequest(post("/server-volumes/"+id+"/attach", body)).object(ServerVolumeSingleResponse.class);
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

    public S3AccessKeySingleResponse getS3AccessKey(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/storage/s3/access-keys/"+id)).object(S3AccessKeySingleResponse.class);
    }

    public EmptyResponse deleteS3AccessKey(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/storage/s3/access-keys/"+id)).object(EmptyResponse.class);
    }

    public S3AccessKeySingleResponse createS3AccessKey(S3AccessKeyCreateRequest body) throws ClientException {
        return wrapRequest(post("/storage/s3/access-keys", body)).object(S3AccessKeySingleResponse.class);
    }

    public S3AccessKeyListResponse getS3AccessKeys() throws ClientException {
        return wrapRequest(get("/storage/s3/access-keys")).object(S3AccessKeyListResponse.class);
    }

    public S3AccessKeyListResponse getS3AccessKeys(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/storage/s3/access-keys").query(params)).object(S3AccessKeyListResponse.class);
    }

    public AddressSingleResponse getAddress(String id) throws ClientException {
        return wrapRequest(get("/addresses/"+id)).object(AddressSingleResponse.class);
    }

    public ServerBackupSingleResponse getServerBackup(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/server-backups/"+id)).object(ServerBackupSingleResponse.class);
    }

    public EmptyResponse deleteServerBackup(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/server-backups/"+id)).object(EmptyResponse.class);
    }

    public ServerBackupSingleResponse updateServerBackup(java.util.UUID id, ServerBackupUpdateRequest body) throws ClientException {
        return wrapRequest(put("/server-backups/"+id, body)).object(ServerBackupSingleResponse.class);
    }

    public NetworkSingleResponse createNetwork(NetworkCreateRequest body) throws ClientException {
        return wrapRequest(post("/networks", body)).object(NetworkSingleResponse.class);
    }

    public NetworkListResponse getNetworks() throws ClientException {
        return wrapRequest(get("/networks")).object(NetworkListResponse.class);
    }

    public NetworkListResponse getNetworks(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/networks").query(params)).object(NetworkListResponse.class);
    }

    public ServerStorageSingleResponse createServerStorage(ServerStorageCreateRequest body) throws ClientException {
        return wrapRequest(post("/server-storages", body)).object(ServerStorageSingleResponse.class);
    }

    public ServerStorageListResponse getServerStorages() throws ClientException {
        return wrapRequest(get("/server-storages")).object(ServerStorageListResponse.class);
    }

    public ServerStorageListResponse getServerStorages(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-storages").query(params)).object(ServerStorageListResponse.class);
    }

    public EmptyResponse resizeServer(String id, ServerResizeRequest body) throws ClientException {
        return wrapRequest(post("/servers/"+id+"/resize", body)).object(EmptyResponse.class);
    }

    public ServerMediaSingleResponse getServerMedia(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/server-medias/"+id)).object(ServerMediaSingleResponse.class);
    }

    public EmptyResponse deleteServerMedia(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/server-medias/"+id)).object(EmptyResponse.class);
    }

    public S3AccessGrantSingleResponse createS3AccessKeyGrant(java.util.UUID access_key_id, S3AccessGrantCreateRequest body) throws ClientException {
        return wrapRequest(post("/storage/s3/access-keys/"+access_key_id+"/grants", body)).object(S3AccessGrantSingleResponse.class);
    }

    public S3AccessGrantListResponse getS3AccessKeyGrants(java.util.UUID access_key_id) throws ClientException {
        return wrapRequest(get("/storage/s3/access-keys/"+access_key_id+"/grants")).object(S3AccessGrantListResponse.class);
    }

    public S3AccessGrantListResponse getS3AccessKeyGrants(java.util.UUID access_key_id, java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/storage/s3/access-keys/"+access_key_id+"/grants").query(params)).object(S3AccessGrantListResponse.class);
    }

    public ServerPriceRangeAssignmentSingleResponse getServerPriceRangeAssignment(String id) throws ClientException {
        return wrapRequest(get("/server-price-range-assignments/"+id)).object(ServerPriceRangeAssignmentSingleResponse.class);
    }

    public EmptyResponse deleteServerPriceRangeAssignment(String id) throws ClientException {
        return wrapRequest(delete("/server-price-range-assignments/"+id)).object(EmptyResponse.class);
    }

    public ServerPriceRangeAssignmentSingleResponse updateServerPriceRangeAssignment(String id, ServerPriceRangeAssignmentUpdateRequest body) throws ClientException {
        return wrapRequest(put("/server-price-range-assignments/"+id, body)).object(ServerPriceRangeAssignmentSingleResponse.class);
    }

    public ServerVNCResponse getServerVNC(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/servers/"+id+"/vnc")).object(ServerVNCResponse.class);
    }

    public ServerActionSingleResponse cancelServerAction(java.util.UUID id) throws ClientException {
        return wrapRequest(post("/server-actions/"+id+"/cancel")).object(ServerActionSingleResponse.class);
    }

    public NetworkSingleResponse getNetwork(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/networks/"+id)).object(NetworkSingleResponse.class);
    }

    public NetworkSingleResponse updateNetwork(java.util.UUID id, NetworkUpdateRequest body) throws ClientException {
        return wrapRequest(put("/networks/"+id, body)).object(NetworkSingleResponse.class);
    }

    public LabelListResponse getLabels() throws ClientException {
        return wrapRequest(get("/labels")).object(LabelListResponse.class);
    }

    public LabelListResponse getLabels(java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/labels").query(params)).object(LabelListResponse.class);
    }

    public ServerVolumeSingleResponse resizeServerVolume(String id, ServerVolumeResizeRequest body) throws ClientException {
        return wrapRequest(post("/server-volumes/"+id+"/resize", body)).object(ServerVolumeSingleResponse.class);
    }

    public S3BucketSingleResponse getS3Bucket(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/storage/s3/buckets/"+id)).object(S3BucketSingleResponse.class);
    }

    public EmptyResponse deleteS3Bucket(java.util.UUID id) throws ClientException {
        return wrapRequest(delete("/storage/s3/buckets/"+id)).object(EmptyResponse.class);
    }

    public ServerVolumeSingleResponse detachServerVolume(java.util.UUID id) throws ClientException {
        return wrapRequest(post("/server-volumes/"+id+"/detach")).object(ServerVolumeSingleResponse.class);
    }

    public ServerVariantPriceSingleResponse createServerVariantPrice(java.util.UUID id, ServerVariantPriceCreateRequest body) throws ClientException {
        return wrapRequest(post("/server-price-ranges/"+id+"/variant-prices", body)).object(ServerVariantPriceSingleResponse.class);
    }

    public ServerVariantPriceListResponse getServerVariantPrices(java.util.UUID id) throws ClientException {
        return wrapRequest(get("/server-price-ranges/"+id+"/variant-prices")).object(ServerVariantPriceListResponse.class);
    }

    public ServerVariantPriceListResponse getServerVariantPrices(java.util.UUID id, java.util.Map<String, String> params) throws ClientException {
        return wrapRequest(get("/server-price-ranges/"+id+"/variant-prices").query(params)).object(ServerVariantPriceListResponse.class);
    }


}