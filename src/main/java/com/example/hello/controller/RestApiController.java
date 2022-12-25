package com.example.hello.controller;


import com.example.hello.annotation.Timer;
import com.example.hello.dto.User00;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/api/")
public class RestApiController {
    // 각 엔드포인트 안 로그들을 하나로 합치자 -> AOP

    @GetMapping("/method/{id}")
    public String  get(@PathVariable Long id, @RequestParam String name){
        log.trace("get() Entry Point");

        log.info("get() - id : {}", id);
        log.info("get() - name : {}", name);

        return id + " " + name;
    }


    @PostMapping("/method/post")
    public User00 post(@RequestBody User00 user){
        log.trace("post() Entry Point");

        log.info("user : {}", user);

        return user;
    }

    @Timer
    @DeleteMapping("/method/delete")
    public void delete() throws InterruptedException {

        // DB Logic
        Thread.sleep(1000 * 2);
    }

}// end class
