package com.example.hello.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
/*
    필드의 값이 NULL 값인경우 제거해서 보여줌
*/
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private int age;

//    @JsonProperty("phone_number")
    private String phoneNumber;
    private String address;

}// end class
