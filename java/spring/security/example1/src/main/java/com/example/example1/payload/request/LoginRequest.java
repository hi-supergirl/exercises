package com.example.example1.payload.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
