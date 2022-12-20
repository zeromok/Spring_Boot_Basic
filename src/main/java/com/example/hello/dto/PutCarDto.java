package com.example.hello.dto;

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
