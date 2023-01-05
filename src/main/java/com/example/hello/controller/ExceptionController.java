package com.example.hello.controller;

import com.example.hello.dto.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("/api")
@Validated
public class ExceptionController {

    @RequestMapping("")
    public User get(
            @Size(min = 2)
            @RequestParam String name,

            @NotNull
            @Min(1)
            @RequestParam Integer age
    ) {

        int a = 10 + age;

        return new User(name, age);
    }

    @PostMapping("")
    public User post(@Valid @RequestBody User user) {
        return user;
    }

} // end class
