package com.example.hello.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Encoder {

    private MyEncoder myEncoder;

   /* public Encoder() {

//        this.myEncoder = new Base64Encoder();
        this.myEncoder = new UrlEncoder();

    }*/

    public Encoder( MyEncoder myEncoder) {
        this.myEncoder = myEncoder;
    }

    public void setMyEncoder(MyEncoder myEncoder){
        this.myEncoder = myEncoder;
    }

    public String encode(String massage) {
        return myEncoder.encode(massage);
    }

}
