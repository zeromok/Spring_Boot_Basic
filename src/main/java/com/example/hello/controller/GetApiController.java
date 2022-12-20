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
    // path = "명시적인 주소 지정"
    public String getHello(){

        return "get Hello";

    }// getHello()


    @RequestMapping(path = "/hi", method = RequestMethod.GET)   // http://localhost:8080/api/get/hi
    // 옛 방식
    public String hi(){
        return "get hi";
    }// hi()


    @GetMapping("/path-variable/{name}")   // http://localhost:8080/api/get/path-variable/{name} -> {} : 변수
    // {} 안 이름과 변수이름은 같아야 한다.
    public String pathVariable(@PathVariable String name){

        log.info("PathVariable : {}", name);
        return name;

    }// pathVariable()

    /*
        위 쪽에서 만약 매개변수로 name 을 받는다면 겹치기 때문에
        구분해주기 위해 name 이라는 속성 사용
        즉, pathVariable 과 변수의 이름이 다를 때
    */
//    @GetMapping("/path-variable/{id}")   // http://localhost:8080/api/get/path-variable/{name} -> {} : 변수
//    // {} 안 이름과 다른 이름의 변수에 담고 싶을 땐?
//    public String pathVariable(@PathVariable(name = "id") String pathName){
//
//        log.info("PathVariable : {}", pathName);
//        return pathName;
//
//    }// pathVariable()


    // http://localhost:8080/api/get/query-param?user=steve&email=steve@gmail.com&age=30
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            log.info(entry.getKey());
            log.info(entry.getValue());

            sb.append(entry.getKey() + "=" + entry.getValue());

        });

        return sb.toString();

           /* queryParam.forEach( (key, value) -> {
                log.info(key);
                log.info(value);

                sb.append(key).append("=").append(value);
            });
            return sb.toString();*/

    }// queryParam() - param 을 받는 1번째 방법


    @GetMapping(path = "query-param02") // http://localhost:8080/api/get/query-param02?name=mokk&age=30
    public String queryParam02(
            @RequestParam String name,
            @RequestParam int age) {

        log.info(name);
        log.info(age);

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
