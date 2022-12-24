package com.example.hello.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SwaggerDto {

    @ApiModelProperty(value = "사용자의 이름", example = "zeromok", required = true)
    private String name;

    @ApiModelProperty(value = "사용자의 나이", example = "30", required = true)
    private int age;

} // end class
