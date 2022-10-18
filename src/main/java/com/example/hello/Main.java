package com.example.hello;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {

    public static void main(String[] args) {


        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        // Base 64 encoding
//        Base64Encoder encoder = new Base64Encoder();
        MyEncoder encoder = new Base64Encoder();
        String result = encoder.encode(url);

        log.info(result);

        // url encoding
//        UrlEncoder urlEncoder = new UrlEncoder();
        MyEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);

        log.info(urlResult);

    }
}
