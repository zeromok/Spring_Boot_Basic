package com.example.hello.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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
