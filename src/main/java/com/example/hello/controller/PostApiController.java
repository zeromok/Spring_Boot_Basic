package com.example.hello.controller;


import com.example.hello.dto.PostRequestDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@Log4j2
@RestController
@RequestMapping("/api/")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody Map<String , Object> requestData){
        // 요청 바디에 있는 데이터를 꺼내오려면 명시적인 @RequestBody 가 필요하다.
        log.trace("==== post() ====");

        requestData.forEach((key, value) -> {

            log.info("Key : {}", key);
            log.info("Value : {}", value);

        });

    }// end post()


    @PostMapping("/post02")
    public void post02(@RequestBody PostRequestDto postRequestDto){
        log.trace("==== post02() ====");

        log.info("account : {}",postRequestDto.getAccount());
        log.info("email : {}",postRequestDto.getEmail());
        log.info("address : {}",postRequestDto.getAddress());
        log.info("password : {}",postRequestDto.getPassword());
        log.info("phone_number : {}",postRequestDto.getPhoneNumber());
        /*
            요청은 _ 기법일 때 오류 null
            매칭 방법은 여러가지가 있다.
        */
        // 이도저도 아닌 방식 일 땐?
        log.info("OTP : {}",postRequestDto.getOTP());

        }// end post02()



}// end class()
