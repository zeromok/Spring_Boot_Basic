package com.example.hello.ioc;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component  // 빈으로 등록
public class Base64Encoder implements MyEncoder {
    public String encode(String message) {

        return Base64.getEncoder().encodeToString(message.getBytes());

    }

}// end class
