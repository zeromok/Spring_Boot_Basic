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

    // TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        log.trace("==== text() ====");
        return account;
    }// text()


    // JSON
    @PostMapping("/json")
    public User json(@RequestBody User user) {
        log.trace("==== json() ====");

        return user;

    }// json


    // 201 응답은 어떻게 내려줄 것 인가? -> 리소스가 생성되었을 때의 응답
    // ResponseEntity
    @PutMapping("/json")
    public ResponseEntity<User> putJson(@RequestBody User user){
        log.trace("==== PUT json() ====");
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }// putJson



}// end class
