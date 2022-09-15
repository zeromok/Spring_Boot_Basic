package OOP03.ch09;

public class Desktop extends Computer{

    // 추상메소드 정의
    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    // 추상메소드 정의
    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    // 메소드 재정의
    @Override
    public void turnOff() {
        System.out.println("Desktop turnOff");
    }
}
