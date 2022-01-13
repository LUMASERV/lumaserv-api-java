package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ResponseMessages {
    @MapperOptions(name = "warnings")
    private ResponseMessage[] warnings;
    @MapperOptions(name = "errors")
    private ResponseMessage[] errors;
    @MapperOptions(name = "infos")
    private ResponseMessage[] infos;
}

