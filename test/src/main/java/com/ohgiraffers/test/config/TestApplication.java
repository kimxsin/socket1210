package com.ohgiraffers.test.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//@EnableJpaRepositories(basePackages = "com.ohgiraffers.test.repository")
//@EntityScan(basePackages = "com.ohgiraffers.test.entity") // 필요없을수도
@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
