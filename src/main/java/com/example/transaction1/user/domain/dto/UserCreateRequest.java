package com.example.transaction1.user.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserCreateRequest {

    private final String userId;
    private final String userEmail;
}
