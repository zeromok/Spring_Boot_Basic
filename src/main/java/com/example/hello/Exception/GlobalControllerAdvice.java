package com.example.hello.Exception;

import com.example.hello.dto.Error;
import com.example.hello.dto.ErrorResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import javax.validation.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

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
    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException e, HttpServletRequest req) {

        List<Error> errorList = new ArrayList<>();

        // 예외 가 제공하는 메소드 활용
        BindingResult bindingResult = e.getBindingResult();

        bindingResult.getAllErrors().forEach((error) -> {
            FieldError field = (FieldError) error;

            String fieldName = field.getField();
            String message = field.getDefaultMessage();
            String value = field.getRejectedValue().toString();
            log.info("- fieldName : {}", fieldName);
            log.info("- message : {}", message);
            log.info("- value : {}", value);
            log.trace("----------------");

            Error errorMessage = new Error();
            errorMessage.setField(fieldName);
            errorMessage.setMessage(message);
            errorMessage.setInvalidValue(value);

            errorList.add(errorMessage);
        });

        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrorList(errorList);
        errorResponse.setMessage("");
        errorResponse.setRequestUrl(req.getRequestURL().toString());
        errorResponse.setStatusCode(HttpStatus.BAD_REQUEST.toString());
        errorResponse.setResultCode("FAIL");

//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResponseEntity constraintViolationException(ConstraintViolationException e) {

        // 예외 가 제공하는 메소드 활용
        e.getConstraintViolations().forEach( (error) -> {
            log.trace("error : {}", error);

            Stream<Path.Node> stream = StreamSupport.stream(error.getPropertyPath().spliterator(),false);
            List<Path.Node> list = stream.collect(Collectors.toList());

            String field = list.get(list.size() - 1).toString();
            String message = error.getMessage();
            String invalidValue = error.getInvalidValue().toString();
            log.info("- field : {}", field);
            log.info("- message : {}", message);
            log.info("- invalidValue : {}", invalidValue);
        });

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public ResponseEntity missingServletRequestParameterException(MissingServletRequestParameterException e) {

        // 예외 가 제공하는 메소드 활용
        String fieldName = e.getParameterName();
        String fieldType = e.getParameterType();
        String invalidValue = e.getMessage();
        log.info("- fieldName : {}", fieldName);
        log.info("- fieldType : {}", fieldType);
        log.info("- invalidValue : {}", invalidValue);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());

    }

} // end class
