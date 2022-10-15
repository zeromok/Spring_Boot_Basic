package com.example.hello.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
public class PutRequestDto {

    private String name;
    private int age;

//    @JsonProperty("car_list")
    /*
        json 으로 넘어오는 "이름"이 스네이크형식 일 때 받을 수있게 설정
        carList, car_list 둘다 되는건 아니다.
    */
    private List<PutCarDto> carList;

}// end class
