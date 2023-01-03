package com.example.transaction1.service;

import com.example.transaction1.user.domain.entity.testUser;
import com.example.transaction1.user.service.UserCreateService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class testUserCreateServiceTest {

    @Autowired
    private UserCreateService userCreateService;

    @Test
    void createUser() {
        Long l = 1L;
        userCreateService.create(new testUser(l, "user" + l, "user" + l + "@test.com"));
    }

    @DisplayName("사용자를 조회한다.")
    @Test
    void selectUser() {
        testUser testUser = userCreateService.getByUserKey(1L);
        assertThat(testUser).isNotNull();
    }

    @DisplayName("사용자들을 조회한다.")
    @Test
    void selectUsers() {
        List<testUser> users = userCreateService.findAll();
        assertThat(users).hasSize(2);
    }
}