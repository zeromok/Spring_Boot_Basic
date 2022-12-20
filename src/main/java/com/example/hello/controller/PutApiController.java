package com.example.hello.controller;


import com.example.hello.dto.PutRequestDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/api/")
public class PutApiController {

    @PutMapping("/put")
    public void put(@RequestBody PutRequestDto putRequestDto) {

        log.info("putRequestDto : {}", putRequestDto);

    }// put()

}// end class
