package com.example.hello.objectMapper.dto;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private String name;
    private int age;
    private List<Car> cars;

}
