package com.ohgiraffers.test.service;

import com.ohgiraffers.test.entity.User;
import com.ohgiraffers.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 사용자 이름으로 사용자 찾기
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // 새로운 사용자 저장
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
