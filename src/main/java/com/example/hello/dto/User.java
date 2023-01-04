package com.example.hello.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
/*
    필드의 값이 NULL 값인경우 제거해서 보여줌
    즉, 필드의 값이 NULL 로 들어온 경우, 응답을 내려줄때에는 NULL 값의 필드가 보이지 않음
*/
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotEmpty
    @Size(min = 1, max = 10)
    private String name;
    @Min(value = 1)
    @NotNull
    private Integer age;

//    @JsonProperty("phone_number")
//    private String phoneNumber;
//    private String address;

}// end class
