package com.example.hello.ioc;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Log4j2
@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloApplication.class, args);

        ApplicationContext context = ApplicationContextProvider.getContext();
        // 스프링 부트가 실행되고 난 후, ApplicationContext 가져오기

//        Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
//        UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);
        Encoder encoder = context.getBean("urlEncode", Encoder.class);
        // ApplicationContext 안 Bean 가져오기

//        Encoder encoder = new Encoder(base64Encoder);
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        String result = encoder.encode(url);
        log.info("result : {}", result);

//        encoder.setMyEncoder(urlEncoder);
//        result = encoder.encode(url);
//        log.info("result : {}", result);




    }

}// end class

@Configuration
// 한 개의 클래스에서 여러개의 빈을 등록 하겠다.
class AppConfig {

    @Bean("base64Encode")
    public Encoder encoder(Base64Encoder base64Encoder){
        return new Encoder(base64Encoder);
    }

    @Bean("urlEncode")
    public Encoder encoder(UrlEncoder urlEncoder){
        return new Encoder(urlEncoder);
    }

}// end class
