package com.example.hello.service;

import com.example.hello.dto.User;
import com.example.hello.dto.UserRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Log4j2
@Service
public class RestTemplateService {

    // http://localhost/api/server/hello
    // response
//    public String hello() {   // 1.
//    public ResponseEntity<String> hello() { // 2.
    public ResponseEntity<User> hello() { // 3.

    // GET 방식
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/hello")
                .queryParam("name", "steve")    // 4.
                .queryParam("age", 30)  // 4.
//              http://localhost:9090/api/server/hello?name=steve&age=30
                .encode()
                .build()
                .toUri();

        log.info(uri.toString());

        RestTemplate restTemplate = new RestTemplate();

        // 1. String 으로 받을 때
//        String result = restTemplate.getForObject(uri, String.class);

        // 2. ResponseEntity 로 받을 때
//        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
//        log.info("code : {}", result.getStatusCode());
//        log.info("body : {}", result.getBody());

        // 3. JSON 으로 받으려면?
        ResponseEntity<User> result = restTemplate.getForEntity(uri, User.class);
        log.info("code : {}", result.getStatusCode());
        log.info("body : {}", result.getBody());

        return result;
    }

    // POST 방식
    public User post() {
//    public ResponseEntity<User> post() {
        // http://localhost:9090/api/server/name/{userName}/age/{userAge}

        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/name/{userName}/age/{userAge}")
                .encode()
                .build()
                // expand() : PathVariable 에 순서대로 매핑
                .expand("test", 10)
                .toUri();
        log.info("uri : {}", uri.toString());

        /*
        * Http Body -> Object -> ObjectMapper -> Json -> Rest Template -> Http Body Json
        *   POST 방식은 body 에 데이터를 넣어줘야한다. -> Http Body
        *   Body 에 Object 로 넣으면 ObjectMapper 가 Json 으로 바꾸어 Rest Template 에서 Body 에 Json 형식으로 넣어줌
        * */
        User user = new User("steve", 10, null, null);

        RestTemplate restTemplate = new RestTemplate();

        // uri 에 user 보낼꺼고, User 타입으로 반환 받을꺼야
        ResponseEntity<User> responseEntity = restTemplate.postForEntity(uri, user, User.class);
        log.info("Code : {}", responseEntity.getStatusCode());
        log.info("Headers : {}", responseEntity.getHeaders());
        log.info("Body : {}", responseEntity.getBody());

        return responseEntity.getBody();
//        return responseEntity;
    }

    // exchange 의 활용
//    public ResponseEntity<User> exchange() {
    public User exchange() {
        // http://localhost:9090/api/server/name/{userName}/age/{userAge}

        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/post")
                .encode()
                .build()
                .toUri();
        log.info("uri : {}", uri.toString());

        /*
         * Http Body -> Object -> ObjectMapper -> Json -> Rest Template -> Http Body Json
         *   POST 방식은 body 에 데이터를 넣어줘야한다. -> Http Body
         *   Body 에 Object 로 넣으면 ObjectMapper 가 Json 으로 바꾸어 Rest Template 에서 Body 에 Json 형식으로 넣어줌
         * */
        User user = new User("steve", 10, null, null);

        RequestEntity<User> requestEntity = RequestEntity
                .post(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .header("x-authorization", "abcd")
                .header("custom-header", "aaaa")
                .body(user);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User> result = restTemplate.exchange(requestEntity, User.class);

//        return result;
        return result.getBody();
    }


} // end class
