package com.ohgiraffers.test.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.ohgiraffers.test")
@EnableJpaRepositories(basePackages = "com.ohgiraffers.test")
@EntityScan(basePackages = "com.ohgiraffers.test")
public class ContextConfig {
}
