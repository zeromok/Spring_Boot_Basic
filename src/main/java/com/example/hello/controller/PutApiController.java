package com.example.hello.controller;


import com.example.hello.dto.PutRequestDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/api/")
public class PutApiController {
    // 리소스의 갱신(데이터가 있으면...), 생성

    @PutMapping("/put")
    public void put(@RequestBody PutRequestDto putRequestDto) {

        log.info("putRequestDto : {}", putRequestDto);

    }// put()

    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto, @PathVariable(name = "userId") Long id) {

        log.info("putRequestDto : {}", putRequestDto);
        log.info("id : {}", id);

        return putRequestDto;

    }// put()

}// end class
