package com.example.hello.controller;


import com.example.hello.dto.User;
import com.example.hello.dto.ValidUserDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Log4j2
@RestController
@RequestMapping("/api")
public class ValidController {

    @PostMapping("/user")
    public ResponseEntity user(@Valid @RequestBody ValidUserDTO validUserDTO, BindingResult bindingResult) {
        log.trace("validUserDTO : {}", validUserDTO);

        // 오류 만들어 확인해보기 (코드에서 처리하는 방법, 나중에 예외처리로...)
        if(bindingResult.hasErrors()) {

            StringBuilder sb = new StringBuilder();

            bindingResult.getAllErrors().forEach(objectError -> {

                FieldError field = (FieldError)objectError;
                String message = objectError.getDefaultMessage();;

                log.info("- field : {}", field.getField());
                log.info("- message : {}", message);

                sb.append("- field : " + field.getField() + "\n");
                sb.append("- message : " + message + "\n");

            });

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());

        }

        // 일반적인 유효성검증
//        if(validUserDTO.getPhoneNumber() != "xxx-xxxx-xxxx") {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(validUserDTO);
//        }

        // Logic 수행

        return ResponseEntity.ok(validUserDTO);
    }

} // end class
