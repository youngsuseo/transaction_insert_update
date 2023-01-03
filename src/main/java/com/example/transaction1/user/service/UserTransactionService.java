package com.example.transaction1.user.service;

import com.example.transaction1.user.domain.entity.TestUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class UserTransactionService {

    private final UserCreateService userCreateService;
    private final UserSeparateTransactionService separateTransactionService;

    @Transactional
    public void updateAfterInsert(String userId, String userEmail, String modifiedId) {
        TestUser testUser = new TestUser(userId, userEmail);
        userCreateService.create(testUser);
        userCreateService.update(testUser.getUserKey(), modifiedId);
    }

    @Transactional
    public void insertSeparateUpdate(String userId, String userEmail, String modifiedId) {
        TestUser testUser = new TestUser(userId, userEmail);
        userCreateService.create(testUser);
        separateTransactionService.update(testUser.getUserKey(), modifiedId);
    }
}
