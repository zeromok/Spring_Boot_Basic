package com.example.hello.controller;


import org.springframework.web.bind.annotation.*;

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
    public String queryParam(){
        return "";
    }


}// end class
