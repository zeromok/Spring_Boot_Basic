package com.example.hello;

import com.example.hello.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
class HelloApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        log.trace("==== contextLoads() ====");

        /*
            Object Mapper
                : Text JSON(req) -> Object
                : Object -> Text JSON(res)

            이제까지는 Controller 로 들어온 req 안 json 을 -> object 로,
            rep Object 를 json 으로 자동으로 변환 되었는데 직접 변환 해보자
        */

        var objectMapper = new ObjectMapper();

        // ==============
        // Object -> Text
        // ==============
        // ObjectMapper 가 getMethod(@Getter) 를 활용한다.
        // -> 내가 작성한 클래스가 Object Mapper 로 활용될 때 class 안에 get 붙은 메소드 있으면 안됨
        // ALL 생성자 있어야함
        var user = new User("user00", 30);

        var toText = objectMapper.writeValueAsString(user);
        // toString

        log.info("To_Text : {}", toText);


        // ==============
        // Text -> Object
        // ==============
        // 디폴트 생성자 있어야함
        var ToObjectUser = objectMapper.readValue(toText, User.class);
        // .readValue(json 형식의 text, 어떤 클래스로 바꿀건지?)

        log.info("To_ObjectUser : {}", ToObjectUser);

    }

}
