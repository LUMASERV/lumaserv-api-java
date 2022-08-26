package com.lumaserv.client.compute;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class SearchResults {
    @MapperOptions(name = "server_volumes")
    private ServerVolume[] serverVolumes;
    @MapperOptions(name = "ssh_keys")
    private SSHKey[] sshKeys;
    @MapperOptions(name = "servers")
    private Server[] servers;
    @MapperOptions(name = "server_medias")
    private ServerMedia[] serverMedias;
    @MapperOptions(name = "s3_buckets")
    private S3Bucket[] s3Buckets;
    @MapperOptions(name = "s3_access_keys")
    private S3AccessKey[] s3AccessKeys;
}

