package com.example.hello.aop;


import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Log4j2
@Aspect
@Component
public class ParameterAop {

    @Pointcut("execution(* com.example.hello.controller..*.*(..))")
    private void pointCut(){}


    @Before("pointCut()")
    public void before(JoinPoint joinPoint){

        // 메소드 이름 가져오기
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        log.trace(method.getName());


        Object[] args = joinPoint.getArgs();


        for(Object obj : args){
            log.info("type : {}", obj.getClass().getSimpleName());
            log.info("value : {}", obj);
        }
    }

    @AfterReturning(value = "pointCut()", returning = "object")
    public void afterReturn(JoinPoint joinPoint, Object object){
        log.info("object : {}", object);
    }

}// end class
