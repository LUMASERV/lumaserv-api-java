package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Address {
    @MapperOptions(name = "address")
    private String address;
    @MapperOptions(name = "assignments")
    private AddressAssignments[] assignments;
    @MapperOptions(name = "project_id")
    private java.util.UUID projectId;
    @MapperOptions(name = "subnet_id")
    private java.util.UUID subnetId;
    @MapperOptions(name = "created_at")
    private String createdAt;
    @MapperOptions(name = "id")
    private java.util.UUID id;
}

