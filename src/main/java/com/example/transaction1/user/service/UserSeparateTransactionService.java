package com.example.transaction1.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserSeparateTransactionService {

    private final UserCreateService userCreateService;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void update(long userKey, String userId) {
        userCreateService.update(userKey, userId);
    }
}
