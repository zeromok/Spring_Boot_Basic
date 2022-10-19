package com.example.hello;

public class Encoder {

    private MyEncoder myEncoder;

   /* public Encoder() {

//        this.myEncoder = new Base64Encoder();
        this.myEncoder = new UrlEncoder();

    }*/

    public Encoder(MyEncoder myEncoder) {
        this.myEncoder = myEncoder;
    }

    public String encode(String massage) {
        return myEncoder.encode(massage);
    }

}
