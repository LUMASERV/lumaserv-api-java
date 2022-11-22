package com.lumaserv.client.auth;

import lombok.*;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;
import org.javawebstack.abstractdata.AbstractObject;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PasswordChangeRequest {
    @MapperOptions(name = "new_password_confirm")
    private String newPasswordConfirm;
    @MapperOptions(name = "new_password")
    private String newPassword;
    @MapperOptions(name = "current_password")
    private String currentPassword;
}

