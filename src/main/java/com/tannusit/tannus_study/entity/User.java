package com.tannusit.tannus_study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

// mybatis
// SQL 중심의 데이터 접근 프레임 워크
// -> 내가 직접 SQL문 작성하고, 그 결과를 JAVA 객체로 매핑
// SQL을 직접짜기 때문에 완전히 통제 가능(자유도 높음), 대신 코드가 복잡하고 반복적이다
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class User {
    private Integer userId;
    private String username;
    private String email;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;

}
