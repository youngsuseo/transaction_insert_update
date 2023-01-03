package com.example.transaction1.user.repository;

import com.example.transaction1.user.domain.entity.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<TestUser, Long> {

    TestUser getUserByUserKey(Long userKey);
}
