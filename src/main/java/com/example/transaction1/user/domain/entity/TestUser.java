package com.example.transaction1.user.domain.entity;

import com.example.transaction1.user.domain.dto.UserCreateRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TEST_USER")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TestUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userKey;

    private String userId;

    private String userEmail;

    public TestUser(String userId, String userEmail) {
        this.userId = userId;
        this.userEmail = userEmail;
    }

    public TestUser(UserCreateRequest dto) {
        this(null, dto.getUserId(), dto.getUserEmail());
    }

    public static TestUser changedUserId(TestUser testUser, String userId) {
        return new TestUser(testUser.getUserKey(), userId, testUser.getUserEmail());
    }

}
