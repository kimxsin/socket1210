package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.entity.User;
import com.ohgiraffers.test.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 사용자 정보 조회
    @GetMapping("/user")
    public String getUser(String username) {
        User user = userService.findByUsername(username);
        log.info("User found: " + user.getUsername());
        // 사용자 정보를 뷰로 전달
        return "user";
    }
}
