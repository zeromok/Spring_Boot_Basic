package com.example.hello.controller;

import com.example.hello.DTO.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "index.html";
    }// main()


    @ResponseBody
    // 응답바디를 만들어 내리겠다.
    // @Controller 에서는 잘 사용하지 않는다. -> @RestController : REST-API 에서 사용
    @GetMapping("/user")
    public User user() {

//        User user = new User();
        var user = new User();  // 타입추론을 통해 좀 더 쉽게 생성자를 만들 수 있다.
        user.setName("user00");
        user.setAddress("fdsafdsa");

        return user;

    }// user()


}// end class
