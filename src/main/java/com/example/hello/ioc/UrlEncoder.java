package com.example.hello.ioc;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Component("url")
public class UrlEncoder implements MyEncoder {

    public String encode(String massage){

        try {

            return URLEncoder.encode(massage, "UTF-8");

        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }

}
