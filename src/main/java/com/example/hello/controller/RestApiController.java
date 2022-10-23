package com.example.hello.controller;


import com.example.hello.DTO.User00;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/api/")
public class RestApiController {

    @GetMapping("/method/{id}")
    public void get(@PathVariable Long id, @RequestParam String name){
        log.info("get method ");
        log.info("get method - id : {}", id);
        log.info("get method - name : {}", name);
    }


    @PostMapping("/method/post")
    public void post(@RequestBody User00 user){
        log.info("user : {}", user);
    }

}// end class
