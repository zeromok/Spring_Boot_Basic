package com.example.hello.controller;


import com.example.hello.dto.SwaggerDto;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"test API 입니다."})
@RestController
@RequestMapping("/test/")
public class SwaggerController {
    /*
        @Api : 클래스를 스웨거의 리소스로 표시
        @ApiOperation : 특정 경로의 오퍼레이션 HTTP 메소드 설명
        @ApiParam : 오퍼레이션의 파라미터에 메타 데이터 설면
        @ApiResponse : 오퍼레이션의 응답 지정
        @ApiModeProperty : 모델의 속성 데이터를 설명
        @ApiImplicitParams, @ApiImplicitParam : 메소드 단위의 오퍼레이션 파라미터 설명
    */

    @GetMapping("/hello") // http://localhost:8080/test/hello
    public String hello() {
        return "Hello";
    }

    // ApiParam 을 묶어서 사용하는 방법
    @ApiImplicitParams({
                    @ApiImplicitParam(name = "x" ,value = "x값", required = true, dataType = "int", paramType = "path"),
                    @ApiImplicitParam(name = "y" ,value = "y값", required = true, dataType = "int", paramType = "query")
    })
    @GetMapping("/plus/{x}") // http://localhost:8080/test/plus/10?y=10
    public int plus(
                    // parameters 의 이름들을 value 로 지정
//                    @ApiParam(value = "x값")
                    @PathVariable int x,

//                    @ApiParam(value = "y값")
                    @RequestParam int  y) {
        return x + y;
    }

    // 문서 아래 코드 부분에 추가되는....
    @ApiResponse(code = 502, message = "사용자의 나이가 10살 이하일 때")
    // Ex) GET /test/user/ 사용자의 이름과 나이를 echo 하는 메소드 -> 문서의 별칭?
    @ApiOperation(value = "사용자의 이름과 나이를 echo 하는 메소드")
    @GetMapping("/user/") // http://localhost:8080/test/user/?age=30&name=hihi
    public SwaggerDto user(SwaggerDto dto) {

        SwaggerDto res = new SwaggerDto();
        res.setName(dto.getName());
        res.setAge(dto.getAge());

        return res;
    }

    @PostMapping("/user/")
    public SwaggerDto userPost(@RequestBody SwaggerDto dto) {

        SwaggerDto res = new SwaggerDto();
        res.setName(dto.getName());
        res.setAge(dto.getAge());

        return res;
    }

} // end class
