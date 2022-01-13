package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ResponseMetadata {
    @MapperOptions(name = "transaction_id")
    private String transactionId;
    @MapperOptions(name = "build_commit")
    private String buildCommit;
    @MapperOptions(name = "build_timestamp")
    private String buildTimestamp;
}

