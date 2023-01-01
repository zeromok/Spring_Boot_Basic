package com.example.hello.service;

import com.example.hello.dto.User;
import lombok.extern.log4j.Log4j2;
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
//    public String hello() {
public ResponseEntity<User> hello() {

    // GET 방식
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/hello")
                .queryParam("name", "steve")
                .queryParam("age", 30)
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

        // JSON 으로 받으려면?
        ResponseEntity<User> result = restTemplate.getForEntity(uri, User.class);
        log.info("code : {}", result.getStatusCode());
        log.info("body : {}", result.getBody());

        return result;
    }

} // end class
