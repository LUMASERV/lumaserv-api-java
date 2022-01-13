package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SSLCertificate {
    @MapperOptions(name = "organisation_id")
    private String organisationId;
    @MapperOptions(name = "valid_until")
    private String validUntil;
    @MapperOptions(name = "project_id")
    private String projectId;
    @MapperOptions(name = "type_id")
    private String typeId;
    @MapperOptions(name = "approver_email")
    private String approverEmail;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "admin_contact_id")
    private String adminContactId;
    @MapperOptions(name = "id")
    private String id;
    @MapperOptions(name = "tech_contact_id")
    private String techContactId;
    @MapperOptions(name = "labels")
    private Object labels;
}

