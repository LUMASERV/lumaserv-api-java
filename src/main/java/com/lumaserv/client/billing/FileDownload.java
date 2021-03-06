package com.lumaserv.client.billing;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class FileDownload {
    @MapperOptions(name = "file_id")
    private String fileId;
    @MapperOptions(name = "url")
    private String url;
}

