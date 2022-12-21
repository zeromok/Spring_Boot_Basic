package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 해당 클래스는 REST API 를 처리하는 Controller, @Controller + @ResponseBody -> 주 용도 : JSON 형태의 객체 데이터 반환
@RequestMapping("/api/") // Base URL
public class ApiController {

    @GetMapping("/hello")   // http://localhost:8080/api/hello
    public String hello() {
        // 반환타입이 String 이면 view 의 이름이 아닌 문자열 반환

        return "hello spring boot!";

    }// hello()

}// end class
