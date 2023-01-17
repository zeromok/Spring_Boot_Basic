package com.example.hello.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    private String requestUrl;
    private String  statusCode;
    private String code;
    private String resultCode;
    private String message;
    private List<Error> errorList;

}
