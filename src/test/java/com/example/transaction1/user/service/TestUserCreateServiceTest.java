package com.example.transaction1.user.service;

import com.example.transaction1.user.domain.entity.TestUser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TestUserCreateServiceTest {

    @Autowired
    private UserCreateService userCreateService;

    @Test
    void createUser() {
        Long l = 1L;
        userCreateService.create(new TestUser(l, "user" + l, "user" + l + "@test.com"));
    }

    @DisplayName("사용자를 조회한다.")
    @Test
    void selectUser() {
        TestUser testUser = userCreateService.getByUserKey(1L);
        assertThat(testUser).isNotNull();
    }

    @DisplayName("사용자들을 조회한다.")
    @Test
    void selectUsers() {
        List<TestUser> users = userCreateService.findAll();
        assertThat(users).hasSize(2);
    }

    @DisplayName("사용자 데이터를 수정한다.")
    @Test
    void updateUser() {
        userCreateService.update(2L, "user0");
    }
}