package com.ohgiraffers.test.repository;

import com.ohgiraffers.test.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByUsername(String username);  // 사용자 이름으로 메시지 조회
}
