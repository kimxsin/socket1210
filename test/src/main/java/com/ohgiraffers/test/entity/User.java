package com.ohgiraffers.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")  // 기존 테이블에서 컬럼 이름에 맞추기
    private long id;

    @Column(name = "user_name")  // 기존 테이블에서 컬럼 이름에 맞추기
    private String username;

    @Column(name = "user_password")  // 비밀번호 컬럼도 마찬가지
    private String password;
}
