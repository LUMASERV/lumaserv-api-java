package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SSLCertificateCreateRequest {
    @MapperOptions(name = "organisation_id")
    private String organisationId;
    @MapperOptions(name = "tech_contact")
    private Object techContact;
    @MapperOptions(name = "csr")
    private String csr;
    @MapperOptions(name = "project_id")
    private String projectId;
    @MapperOptions(name = "type_id")
    private String typeId;
    @MapperOptions(name = "admin_contact")
    private Object adminContact;
    @MapperOptions(name = "organisation")
    private Object organisation;
    @MapperOptions(name = "approver_email")
    private String approverEmail;
    @MapperOptions(name = "admin_contact_id")
    private String adminContactId;
    @MapperOptions(name = "tech_contact_id")
    private String techContactId;
    @MapperOptions(name = "validation_method")
    private String validationMethod;
    @MapperOptions(name = "labels")
    private Object labels;
}

