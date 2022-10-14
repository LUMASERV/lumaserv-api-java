package com.lumaserv.client.addon;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SSLCertificate {
    @MapperOptions(name = "organisation_id")
    private java.util.UUID organisationId;
    @MapperOptions(name = "valid_until")
    private String validUntil;
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "type_id")
    private java.util.UUID typeId;
    @MapperOptions(name = "approver_email")
    private String approverEmail;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "admin_contact_id")
    private java.util.UUID adminContactId;
    @MapperOptions(name = "id")
    private java.util.UUID id;
    @MapperOptions(name = "tech_contact_id")
    private java.util.UUID techContactId;
    @MapperOptions(name = "labels")
    private AbstractObject labels;
}

