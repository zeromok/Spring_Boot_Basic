package com.example.hello.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Encoder implements MyEncoder {

    private MyEncoder myEncoder;

    public Encoder(@Qualifier("base") MyEncoder myEncoder){

        this.myEncoder = myEncoder;

    }

    @Override
    public String encode(String massage){

        return myEncoder.encode(massage);

    }

    public void setMyEncoder(MyEncoder myEncoder){
        this.myEncoder = myEncoder;
    }

}// end class
