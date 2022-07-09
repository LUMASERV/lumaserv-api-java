package com.lumaserv.client.domain;

import lombok.Getter;
import org.javawebstack.httpclient.HTTPRequest;

@Getter
public class ClientException extends Exception {

    final HTTPRequest request;

    public ClientException(HTTPRequest request) {
        super(request.status() + ": Connection Error");
        this.request = request;
    }
}