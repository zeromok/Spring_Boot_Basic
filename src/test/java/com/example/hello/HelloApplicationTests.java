package com.example.hello;

import com.example.hello.DTO.User;
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
                : Text JSON -> Object
                : Object -> Text JSON

            이제까지는 Controller 로 들어온 req 안 json 을 -> object 로,
            rep Object 를 json 으로 자동으로 변환 되었는데 직접 변환 해보자
        */

        var objectMapper = new ObjectMapper();

        // object -> text
        // ObjectMapper 가 getMethod 를 활용한다.
        // ALL 생성자
        var user = new User("user00", 30, "010-1111-1111", "address");

        var text = objectMapper.writeValueAsString(user);
        // toString

        log.info("text : {}", text);


        // text -> object
        // 디폴트 생성자
        var objectUser = objectMapper.readValue(text, User.class);
        // .readValue(json 형식의 text, 어떤 클래스로 바꿀건지?)

        log.info("objectUser : {}", objectUser);

    }

}
