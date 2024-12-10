package com.ohgiraffers.test.service;

import com.ohgiraffers.test.entity.Message;
import com.ohgiraffers.test.entity.User;
import com.ohgiraffers.test.repository.MessageRepository;
import com.ohgiraffers.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private UserRepository userRepository;

    // 메시지 저장
    public void saveMessage(String username, String message) {
        Message newMessage = new Message();
        newMessage.setUsername(username);
        newMessage.setMessage(message);
        newMessage.setTimestamp(System.currentTimeMillis());  // 현재 시간 저장
        messageRepository.save(newMessage);  // 메시지 저장
    }

    // 사용자 이름으로 메시지 조회
    public List<Message> findMessagesByUsername(String username) {
        return messageRepository.findByUsername(username);  // JPA로 메시지 조회
    }

    // 사용자 찾기
    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);  // JPA로 사용자 조회
    }
}
