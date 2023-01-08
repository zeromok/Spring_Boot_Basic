package com.example.hello.objectMapper;

import com.example.hello.objectMapper.dto.Car;
import com.example.hello.objectMapper.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Log4j2
public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        log.trace("=== main() invoked ===");

        // Object Mapper
        ObjectMapper objectMapper = new ObjectMapper();


        Car car1 = new Car("K5", "11가1111", "세단");

        Car car2 = new Car("Q5", "22가2222", "SUV");

        List<Car> list = Arrays.asList(car1, car2);

        User user = new User("홍길동", 10, list);
        log.info("user : {}", user);
        //  user : User(name=홍길동, age=10, cars=[Car(name=K5, carNumber=11가1111, type=세단), Car(name=Q5, carNumber=22가2222, type=SUV)])

        // Json 형식으로 변환
        String json = objectMapper.writeValueAsString(user);
        log.info("json : {}", json);
        // json : {"name":"홍길동","age":10,"cars":[{"name":"K5","car_number":"11가1111","TYPE":"세단"},{"name":"Q5","car_number":"22가2222","TYPE":"SUV"}]}

        // jsonNode 에 접근
        JsonNode jsonNode = objectMapper.readTree(json);
        String _name = jsonNode.get("name").asText();
        int _age = jsonNode.get("age").asInt();
        log.info("name : {}, age : {}", _name, _age); // name : 홍길동, age : 10

        // 배열 타입의 노드에 접근할 때
        JsonNode cars = jsonNode.get("cars");
        ArrayNode arrayNode = (ArrayNode) cars;
        List<Car> _cars = objectMapper.convertValue(arrayNode, new TypeReference<List<Car>>() {});
        log.info("_cars : {}", _cars);
        // _cars : [Car(name=K5, carNumber=11가1111, type=세단), Car(name=Q5, carNumber=22가2222, type=SUV)]

        // jsonNode 자체에서는 json 데이터를 수정불가 그럼 어떻게?
        ObjectNode objectNode = (ObjectNode) jsonNode;
        objectNode.put("name", "Steve");
        objectNode.put("age", 30);
        log.info("objectNode : {}", objectNode.toPrettyString());

    } // main()

} // end class
