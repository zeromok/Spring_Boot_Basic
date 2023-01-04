package com.example.hello.advice;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Log4j2
@RestControllerAdvice(basePackages = "com.example.hello")   // 패키지 지정가능 우선순위는 @ExceptionHandler 가 더 높다.
//@ControllerAdvice
public class GlobalControllerAdvice {

    @ExceptionHandler(value = Exception.class)  // value : 어떤 예외 잡을꺼야?
    public ResponseEntity exception(Exception e) {
        log.trace("e : {}", e);
        log.trace("e.getLocalizedMessage : {}", e.getLocalizedMessage());
        log.trace("e.getClass : {}", e.getClass());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("");
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

} // end class
