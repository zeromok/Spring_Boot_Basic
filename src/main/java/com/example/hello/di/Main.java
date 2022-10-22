package com.example.hello.di;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {

    public static void main(String[] args) {


        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";  // 인코딩 할 url

        // ==================
        // Base 64 encoding
        // ==================

        // 인코딩 방법 1.
//        Base64Encoder encoder = new Base64Encoder();
//        String BaseResult = encoder.encode(url);
//        log.info("result : {}", BaseResult);

        // 인코딩 방법 2. : 인터페이스로 묶어 유지,보수 용이하게 만듦
//        MyEncoder BaseEncoder = new Base64Encoder();
//        String BaseResult = BaseEncoder.encode(url);
//        log.info("result : {}", BaseResult);

        // 인코딩 방법 3. : Encoder 클래스 안 코드를 바꾸어 Base, Url 인코딩 한번에 수행
//        Encoder encoder = new Encoder();
//        String result = encoder.encode(url);
//        log.info("result : {}", result);

        // 인코딩 방법 4. : Encoder 를 건들지 않고 바꿔보기 = DI
        Encoder encoder = new Encoder(new UrlEncoder());
        String result = encoder.encode(url);
        log.info("result : {}", result);

        // ==================
        // url encoding
        // ==================

        // 인코딩 방법 1.
//        UrlEncoder urlEncoder = new UrlEncoder();
//        String urlResult = urlEncoder.encode(url);
//        log.info("result : {}", urlResult);

        // 인코딩 방법 2. : 인터페이스로 묶어 유지,보수 용이하게 만듦
//        MyEncoder urlEncoder = new UrlEncoder();
//        String urlResult = urlEncoder.encode(url);
//        log.info("result : {}", urlResult);

        // 인코딩 방법 3. : DI 를 이용해 바꿔보자

//        UrlEncoder urlEncoder = new UrlEncoder();
//        MyEncoder urlEncoder = new UrlEncoder();
//        String urlResult = urlEncoder.encode(url);
//
//        log.info(urlResult);

    }
}
