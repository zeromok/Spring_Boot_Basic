package com.example.hello.aop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Log4j2
@Aspect
@Component
public class TimerAop {
    // 해당 메소드의 실행 시간을 알아보자

    @Pointcut("execution(* com.example.hello.controller..*.*(..))")
    // 기능을 어디에 적용 시킬지?, AOP 를 적용 시킬 지점을 설정
    private void cut(){}

    // 패키지 하위에 @Timer 이 설정된 메소드
    @Pointcut("@annotation(com.example.hello.annotation.Timer)")
    private void enableTimer() {}

    // Pointcut 에 설정한 메소드가 실행되기 전, 후 모두 동작 -> 반환값 Object(메소드의 실행 결과를 받아야하니깐)
    @Around("cut() && enableTimer()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        Object result = joinPoint.proceed();
        stopWatch.stop();

        log.trace("Total Time : {}", stopWatch.getTotalTimeSeconds());
        log.trace("Object result : {}", result);

        return result;

    }

} // end class
