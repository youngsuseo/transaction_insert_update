package com.example.transaction1.user.domain.entity;

import com.example.transaction1.user.domain.dto.UserCreateRequest;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TEST_USER")
@NoArgsConstructor
@AllArgsConstructor
public class testUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userKey;

    private String userId;

    private String userEmail;

    public testUser(UserCreateRequest dto) {
        this(null, dto.getUserId(), dto.getUserEmail());
    }
}
