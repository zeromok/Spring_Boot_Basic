package com.example.hello.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
public class PutCarDto {

    private String name;

//    @JsonProperty("car_number")
    /*
        json 으로 넘어오는 "이름"이 스네이크형식 일 때 받을 수있게 설정
        car_number, carNumber 둘다 되는건 아니다. json 에 맞게 수정
    */
    private String carNumber;

}// end class
