package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class TransactionLogRequest {
    @MapperOptions(name = "query")
    private AbstractObject query;
    @MapperOptions(name = "limit")
    private int limit;
    @MapperOptions(name = "sort")
    private AbstractObject sort;
}

