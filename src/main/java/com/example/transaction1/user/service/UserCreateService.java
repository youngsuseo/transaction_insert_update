package com.example.transaction1.user.service;

import com.example.transaction1.user.domain.entity.TestUser;
import com.example.transaction1.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserCreateService {

    private final UserRepository userRepository;

    public void create(TestUser testUser) {
        userRepository.save(testUser);
    }

    public TestUser getByUserKey(Long userKey) {
        return userRepository.getUserByUserKey(userKey);
    }

    public List<TestUser> findAll() {
        return userRepository.findAll();
    }

    public void update(long userKey, String userId) {
        userRepository.save(TestUser.changedUserId(new TestUser(userKey, "test" + userKey, "test" + userKey + "@email.com"), userId));
    }

}
