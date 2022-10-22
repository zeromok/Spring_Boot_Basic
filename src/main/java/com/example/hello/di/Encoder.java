package com.example.hello.di;

public class Encoder implements MyEncoder{

    private MyEncoder myEncoder;

    // 3.
//    public Encoder() {
//
//        this.myEncoder = new Base64Encoder();
//        this.myEncoder = new UrlEncoder();
//
//    }

    // 4.
    public Encoder(MyEncoder myEncoder){

        this.myEncoder = myEncoder;

    }

    public String encode(String massage){

        return myEncoder.encode(massage);

    }

}// end class
