package com.example.hello.controller;

import com.example.hello.dto.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Log4j2
@RestController
@RequestMapping("/api/")
public class ResponseController {
    // Response 내려주기 및 모법사례

    // TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        log.trace("==== text() ====");
        return account;
    }// text()


    // JSON Object 를 내려줄 때
    @PostMapping("/json")
    public User json(@RequestBody User user) {
        /*
            req 가 들어오면 Object mapper 를 통해 Object 로 바뀜
            -> 그 다음 메소드 진입
            -> 메소드가 Object 를 반환
            -> Object mapper 를 통해
            -> json 으로 바뀜
            -> rep 내려줌
        */
        log.trace("==== json() ====");

        return user;

    }// json


    // 201 응답(PUT 이 제대로 되었을 때에 응답)은 어떻게 내려줄 것 인가? -> 리소스가 생성되었을 때의 응답
    // ResponseEntity
    @PutMapping("/json")
    public ResponseEntity<User> putJson(@RequestBody User user){
        log.trace("==== PUT json() ====");

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }// putJson



}// end class
