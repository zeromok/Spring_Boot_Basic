package com.example.hello.dto;

import com.example.hello.annotation.YearMonth;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.format.DateTimeFormatters;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValidUserDTO {

    private String name;

    @Min(value = 0, message = "나이는 0살 이상이여야 합니다.")
    private Integer age;

    @Email
    private String email;

    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 번호의 양식과 맞지 않습니다. 01x-xxx(x)-xxxx")
    private String phoneNumber;

//    @Size(min = 6, max = 6)
    @YearMonth
    private String reqYearMonth;    // yyyyMM

    @AssertTrue(message = "yyyyMM 의 형식에 맞지 않습니다.") // return true 가 되어야 정상, 재활용 불가 하지만 방법이 있음 CustomAnnotation
    public boolean isReqYearMonthValidation() {

        try{

            // LocalDate 는 기본적으로 yyyyMMdd 이여서 뒤에 01 붙여줌
            LocalDate localDate = LocalDate.parse(getReqYearMonth() + "01", DateTimeFormatter.ofPattern("yyyyMMdd"));

        }catch (Exception e) {
            return false;
        }

        return true;
    }


} // end class
