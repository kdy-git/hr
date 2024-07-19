package com.brframe.hr.login.dto;

import lombok.Getter;

@Getter
public class LoginDto {
    private String id;
    private String password;
    private String token;
    private String role;

    public void setLoginResponseInfo(String token, String role, String id) {
        this.id = id;
        this.token = token;
        this.role = role;
    }
}
