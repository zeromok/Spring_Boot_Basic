package com.example.hello.aop;


import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Log4j2
// AOP 를 정의 하는 클래스
@Aspect
@Component
public class ParameterAop {

    @Pointcut("execution(* com.example.hello.controller..*.*(..))")
    // 기능을 어디에 적용 시킬지?, AOP 를 적용 시킬 지점을 설정
    private void pointCut(){}


    @Before("pointCut()")
    // 메소드가 실행되기 이전
    public void before(JoinPoint joinPoint){

        // 메소드 이름 가져오기
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        log.trace("메소드 이름 : {}()",method.getName());


        // 메소드의 매개변수 가져오기
        Object[] args = joinPoint.getArgs();

        for(Object obj : args){
            log.info("type : {}", obj.getClass().getSimpleName());
            log.info("value : {}", obj);
        }
    }

    @AfterReturning(value = "pointCut()", returning = "object")
    // 메소드가 잘 수행되면...
    public void afterReturn(JoinPoint joinPoint, Object object){
        log.info("object : {}", object);
    }

}// end class
