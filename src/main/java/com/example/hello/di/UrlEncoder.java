package com.example.hello.di;

import org.apache.catalina.util.URLEncoder;

import java.nio.charset.StandardCharsets;

public class UrlEncoder implements MyEncoder{

    public String encode(String massage){

        return URLEncoder.DEFAULT.encode(massage, StandardCharsets.UTF_8);

    }

}
