package com.example.hello.aop;


import com.example.hello.dto.User00;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

@Log4j2
@Aspect
@Component
public class DecodeAop {
    // 암호화된 데이터의 복호화 작업을 AOP 에서 해보자
    // 전처리 Decode(코드 -> 문자), 후처리 Encode(문자 -> 코드)

    @Pointcut("execution(* com.example.hello.controller..*.*(..))")
    // 기능을 어디에 적용 시킬지?, AOP 를 적용 시킬 지점을 설정
    private void cut(){}

    // 패키지 하위에 @Timer 이 설정된 메소드
    @Pointcut("@annotation(com.example.hello.annotation.Decode)")
    private void enableDecode() {}

    @Before("cut() && enableDecode()")
    public void before(JoinPoint joinPoint) throws UnsupportedEncodingException {

        // 매개변수 가져오기
        Object[] args = joinPoint.getArgs();

        for(Object arg : args) {

            if(arg instanceof User00) { // User00 타입의 객체일 때

                User00 user = User00.class.cast(arg); // User00 타입으로 형변환
                String base64Email = user.getEmail();                                                         // 이메일을 가져와
                String email = new String(Base64.getDecoder().decode(base64Email), "UTF-8");     // base64 로 디코딩 수행후 String 으로 형변환
                user.setEmail(email);                                                                         // 디코딩된 이메일을 다시 설정해준다.

            }
        }
    }

    @AfterReturning(value = "cut() && enableDecode()", returning = "object")
    public void afterReturning(JoinPoint joinPoint, Object object){

        if(object instanceof User00) {

            User00 user = User00.class.cast(object); // User00 타입으로 형변환
            String email = user.getEmail();                                                // 디코딩된 이메일을 가져와
            String base64Email = Base64.getEncoder().encodeToString(email.getBytes());     // 인코딩 수행후 String 으로 형변환
            user.setEmail(base64Email);                                                    // 인코딩된 이메일을 다시 설정해준다.

        }

    }


}
