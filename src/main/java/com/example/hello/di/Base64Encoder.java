package com.example.hello.di;

import java.util.Base64;

public class Base64Encoder implements MyEncoder{

    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
