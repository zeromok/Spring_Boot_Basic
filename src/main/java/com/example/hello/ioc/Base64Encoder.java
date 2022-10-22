package com.example.hello.ioc;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component("base")
public class Base64Encoder implements MyEncoder {

    public String encode(String massage){

        return Base64.getEncoder().encodeToString(massage.getBytes());

    }

}
