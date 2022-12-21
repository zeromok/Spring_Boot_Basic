package com.example.hello.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
// 클래스 단위로 묶어 선언된 필드(카멜) -> 스네이크 형식으로 바꿔준다. -> 범위가 넓은 @JsonProperty
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PostRequestDto {
    // POST 핸들러 메소드에서 어떤 값을 받을지 모르니 DTO 를 만들어 데이터를 받자

    private String account;
    private String email;
    private String address;
    private String password;


//    private String phone_number;
    @JsonProperty("phone_number") // 요청 형식이 스네이크 형식일 때
    private String phoneNumber;
    /*
        요청은 _ 기법일 때 오류 null
        매칭 방법은 여러가지가 있다.
        그 중 하나 @JsonProperty
    */

    @JsonProperty("OTP")
    private String OTP;


}// end class
