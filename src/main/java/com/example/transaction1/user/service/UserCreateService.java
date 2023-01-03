package com.example.transaction1.user.service;

import com.example.transaction1.user.domain.entity.testUser;
import com.example.transaction1.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserCreateService {

    private final UserRepository userRepository;

    public void create(testUser testUser) {
        userRepository.save(testUser);
    }

    public testUser getByUserKey(Long userKey) {
        return userRepository.getUserByUserKey(userKey);
    }

    public List<testUser> findAll() {
        return userRepository.findAll();
    }
}
