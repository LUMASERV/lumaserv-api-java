package com.lumaserv.client.addon;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SearchResults {
    @MapperOptions(name = "ssl_contacts")
    private SSLContact[] sslContacts;
    @MapperOptions(name = "ssl_organisations")
    private SSLOrganisation[] sslOrganisations;
    @MapperOptions(name = "plesk_licenses")
    private PleskLicense[] pleskLicenses;
    @MapperOptions(name = "ssl_certificates")
    private SSLCertificate[] sslCertificates;
}

