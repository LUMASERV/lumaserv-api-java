package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ResponsePagination {
    @MapperOptions(name = "total")
    private int total;
    @MapperOptions(name = "page")
    private int page;
    @MapperOptions(name = "page_size")
    private int pageSize;
}

