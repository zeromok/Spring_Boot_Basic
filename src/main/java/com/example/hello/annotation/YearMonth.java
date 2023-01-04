package com.example.hello.annotation;

import com.example.hello.validator.YearMonthValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

//@Constraint(validatedBy = { })
@Constraint(validatedBy = {YearMonthValidator.class})   // 어떤 클래스를 가지고 검사할꺼야?
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
public @interface YearMonth {

//    String message() default "{javax.validation.constraints.Email.message}";
    String message() default "yyyyMM 의 형식에 맞지 않습니다.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    String pattern() default "yyyyMMdd";


} // end
