package com.example.hello;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlEncoder implements MyEncoder{

    public String encode(String message){
        try {
            return URLEncoder.encode(message, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
