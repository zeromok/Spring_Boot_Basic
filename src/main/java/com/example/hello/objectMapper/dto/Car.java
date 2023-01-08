package com.example.hello.objectMapper.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String name;

    @JsonProperty("car_number")
    private String carNumber;

    @JsonProperty("TYPE")
    private String type;

}
