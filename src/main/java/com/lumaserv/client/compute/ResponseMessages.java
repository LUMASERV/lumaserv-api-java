package com.lumaserv.client.core;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ResponseMessages {
    @MapperOptions(name = "warnings")
    private ResponseMessage[] warnings;
    @MapperOptions(name = "errors")
    private ResponseMessage[] errors;
    @MapperOptions(name = "infos")
    private ResponseMessage[] infos;
}

