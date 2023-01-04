package com.example.hello.controller;

import com.example.hello.dto.User;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class ExceptionController {

    @RequestMapping("")
    public User get(@RequestParam(required = false) String name, @RequestParam(required = false) Integer age) {

        int a = 10 + age;

        return new User(name, age);
    }

    @PostMapping("")
    public User post(@Valid @RequestBody User user) {
        return user;
    }

} // end class
