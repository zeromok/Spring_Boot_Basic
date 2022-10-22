package com.example.hello.ioc;

import com.example.hello.HelloApplication;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Log4j2
public class IocApplication {

        public static void main(String[] args) {
            SpringApplication.run(IocApplication.class, args);

            ApplicationContext context = ApplicationProvider.getContext();

            String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";  // 인코딩 할 url

            // =========================
            // Base64
            // =========================
//            Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
//            Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
//            Encoder encoder = new Encoder(base64Encoder);
//
//            String BaseResult = base64Encoder.encode(url);
//            log.info("BaseResult : {}", BaseResult);

            // =========================
            // URL
            // =========================
//            UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);
//            encoder.setMyEncoder(urlEncoder);
//
//            String UrlResult = encoder.encode(url);
//            log.info("UrlResult : {}", UrlResult);


            // =========================
            // Encoder
            // =========================
            Encoder encoder = context.getBean(Encoder.class);
            String result = encoder.encode(url);
            log.info("result : {}", result);


        }// main

}// end class

//@Configuration  // 한 개의 클래스에서 여러 빈을 등록
//class AppConfig{
//
//    @Bean("base64")
//    public Encoder encoder(Base64Encoder base64Encoder){
//        return new Encoder(base64Encoder);
//    }
//
//    @Bean("url")
//    public Encoder encoder(UrlEncoder urlEncoder){
//        return new Encoder(urlEncoder);
//    }


// }

