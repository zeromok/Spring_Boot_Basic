package com.example.hello.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PostRequestDto {

    private String account;
    private String email;
    private String address;
    private String password;


//    private String phone_number;
    @JsonProperty("phone_number")
    private String phoneNumber;
    /*
        요청은 _ 기법일 때 오류 null
        매칭 방법은 여러가지가 있다.
        그 중 하나 @JsonProperty
    */

    @JsonProperty("OTP")
    private String OTP;


}// end class
