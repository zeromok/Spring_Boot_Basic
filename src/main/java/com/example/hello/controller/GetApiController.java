package com.example.hello.controller;


import com.example.hello.DTO.UserRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@Log4j2
@RestController // 해당 클래스는 REST API 를 처리하는 Controller
@RequestMapping("/api/get/")
public class GetApiController {

    @GetMapping(path = "/hello")    // http://localhost:8080/api/get/hello
    public String getHello(){
        return "get Hello";
    }// getHello()

    // 옛 방식
    @RequestMapping(path = "/hi", method = RequestMethod.GET)   // http://localhost:8080/api/get/hi
    public String hi(){
        return "get hi";
    }// hi()


    @GetMapping("/path-variable/{name}")   // http://localhost:8080/api/get/path-variable/{name} -> {} : 변수
    public String pathVariable(@PathVariable String name){
        System.out.println("PathVariable" + name);
        return name;
    }// pathVariable()

    /*
        위 쪽에서 만약 매개변수로 name 을 받는다면 겹치기 때문에
        구분해주기 위해 name 이라는 속성 사용
        즉, pathVariable 과 변수의 이름이 다를 때
    */
    @GetMapping("/path-variable/{id}")   // http://localhost:8080/api/get/path-variable/{name} -> {} : 변수
    public String pathVariable(@PathVariable(name = "id") String pathName, String  name){
        System.out.println("PathVariable" + pathName);
        return name;
    }// pathVariable()


    // http://localhost:8080/api/get/query-param?user=steve&email=steve@gmail.com&age=30
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

            sb.append(entry.getKey() + "=" + entry.getValue());

        });

        return sb.toString();

    }// queryParam() - param 을 받는 1번째 방법


    @GetMapping(path = "query-param02")
    public String queryParam02(@RequestParam String name, @RequestParam int age) {

        System.out.println(name);
        System.out.println(age);

        return name + age;

    }// queryParam02() - param 을 받는 2번째 방법


    @GetMapping(path = "query-param03")
    public String queryParam03(UserRequest userRequest){

        log.trace("==== query-param03 ====");

        String name = userRequest.getName();
        int age = userRequest.getAge();

        log.info("name : {}", name);
        log.info("age : {}", age );

        return userRequest.toString();


    }// queryParam03() - param 을 받는 3번째 방법 (추천, 권장)





}// end class
