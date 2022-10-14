package com.lumaserv.client.addon;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SSLCertificateCreateRequest {
    @MapperOptions(name = "organisation_id")
    private java.util.UUID organisationId;
    @MapperOptions(name = "csr")
    private String csr;
    @MapperOptions(name = "approverEmail")
    private String approverEmail;
    @MapperOptions(name = "validationMethod")
    private String validationMethod;
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "type_id")
    private java.util.UUID typeId;
    @MapperOptions(name = "admin_contact")
    private String adminContact;
    @MapperOptions(name = "organisation")
    private String organisation;
    @MapperOptions(name = "admin_contact_id")
    private java.util.UUID adminContactId;
    @MapperOptions(name = "tech_contact_id")
    private java.util.UUID techContactId;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

