package com.lumaserv.client.domain;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DNSRecordSingleResponse {
    @MapperOptions(name = "metadata")
    private ResponseMetadata metadata;
    @MapperOptions(name = "data")
    private DNSRecord data;
    @MapperOptions(name = "success")
    private boolean success;
    @MapperOptions(name = "messages")
    private ResponseMessages messages;
}
