package com.example.hello.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class CarUser {

    @NotBlank
    private String name;
    @Min(value = 0)
    private int age;
    @Valid  // Car 안 필드를 검사하고 싶다면, @Valid 꼭 붙여주기
    private List<Car> cars;

}
