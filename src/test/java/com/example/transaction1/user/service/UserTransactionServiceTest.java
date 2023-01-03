package com.example.transaction1.user.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserTransactionServiceTest {

    @Autowired
    private UserTransactionService transactionService;

    @DisplayName("사용자를 등록하고 수정한다.")
    @Test
    void updateAfterInsert() {
        String index = "2";
        transactionService.updateAfterInsert("user" + index, "userEmail" + index + "test.com", "modifiedId");
    }

    @DisplayName("사용자를 등록하고 수정하는데, 트랜잭션 분리로 insert만 됨을 확인한다.")
    @Test
    void insertSeparateUpdate() {
        String index = "8";
        transactionService.insertSeparateUpdate("test" + index, "test" + index + "@email.com", "modifiedId");
    }
}