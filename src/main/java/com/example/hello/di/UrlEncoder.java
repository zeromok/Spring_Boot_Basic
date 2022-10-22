package com.example.hello.di;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class UrlEncoder implements MyEncoder{

    public String encode(String massage){

        try {

            return URLEncoder.encode(massage, "UTF-8");

        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }

}
