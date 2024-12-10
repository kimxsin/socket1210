package com.ohgiraffers.test.repository;

import com.ohgiraffers.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);  // 사용자 이름으로 사용자 조회
}
