package com.example.hello.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/api/")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account) {
        log.trace("==== delete() ====");

        log.info("userId : {}", userId);
        log.info("account : {}", account);

        // 리소스가 있던 없던 항상 200번이 날아온다. OK -> 멱등성 0

    }// delete()

}// end class
