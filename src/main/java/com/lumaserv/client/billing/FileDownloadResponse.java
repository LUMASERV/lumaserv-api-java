package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class FileDownloadResponse {
    @MapperOptions(name = "metadata")
    private ResponseMetadata metadata;
    @MapperOptions(name = "data")
    private FileDownload data;
    @MapperOptions(name = "success")
    private boolean success;
    @MapperOptions(name = "messages")
    private ResponseMessages messages;
}
