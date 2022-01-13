package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ResponsePagination {
    @MapperOptions(name = "total")
    private int total;
    @MapperOptions(name = "page")
    private int page;
    @MapperOptions(name = "page_size")
    private int pageSize;
}

