package OOP03.Interface.ch15;

public class Customer implements Buy, Sell{

    @Override
    public void buy() {
        System.out.println("Customer buy");
    }// Buy 의 메소드 오버라이드

    @Override
    public void order() {
        System.out.println("Customer order");
    }// Buy, Sell 의 default 메소드 중 하나 오버라이드 하여 재정의


    @Override
    public void sell() {
        System.out.println("Customer sell");
    }// Sell 의 메소드 오버라이드

    public void hello() {
        System.out.println("hello");
    }// Customer 의 메소드
}
