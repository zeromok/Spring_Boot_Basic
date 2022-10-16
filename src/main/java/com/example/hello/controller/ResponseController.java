package com.example.hello.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Log4j2
@RestController
@RequestMapping("/api/")
public class ResponseController {

    // TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        log.trace("==== text() ====");
        return account;
    }

}// end class
