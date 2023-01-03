package com.example.transaction1.user.repository;

import com.example.transaction1.user.domain.entity.testUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<testUser, Long> {

    testUser getUserByUserKey(Long userKey);
}
