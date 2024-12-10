package com.ohgiraffers.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Data
@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")  // 기존 테이블에서 컬럼 이름에 맞추기
    private long id;    // 원래는 long

    @Column(name = "user_name")  // 메시지를 보낸 사용자의 이름
    private String username;

    @Column(name = "message_content")  // 실제 메시지 내용
    private String message;

    @Column(name = "message_timestamp")  // 메시지 전송 시간
    private Long  timestamp;
}
