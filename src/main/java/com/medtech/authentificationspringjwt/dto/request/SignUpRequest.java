package com.medtech.authentificationspringjwt.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor @AllArgsConstructor @Data
public class SignUpRequest{
    private String username;
    private String email;
    private String password;
    private Set<String> roles;
}
