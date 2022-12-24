package com.example.hello.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()                                       // apis, paths 를 사용하기 위한 builder
                .apis(RequestHandlerSelectors.any())            // 현재 RequestMapping 으로 할당된 any(모든 URL 리스트)를 추출
                .paths(PathSelectors.ant("/**"))    // 그중 /api/** 인 URL 들만 필터링
                .build();
    }

    /*
        ApiInfo apiInfo() : API 에 대한 정보를 담고있는 메소드
    */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Test) Spring Boot REST API")    // 맨위 버전과 함께 보여지는 Title
                .version("1.0.0")
                .description("test")                    // 아래 설명 부분
                .build();
    }

} // end class
