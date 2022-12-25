package com.example.hello.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Type(class 위), Method 에 사용할꺼야
@Target({ElementType.TYPE, ElementType.METHOD})
// 런타임 때 사용할꺼야
@Retention(RetentionPolicy.RUNTIME)
public @interface Timer {



}
