package com.example.hwrestapi.auth.login;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
