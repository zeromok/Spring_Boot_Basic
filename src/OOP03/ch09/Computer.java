package OOP03.ch09;

// 추상클래스 와 메소드
public abstract class Computer {

    public abstract void display();
    // 추상클래스의 메소드 선언
    public abstract void typing();
    // 추상클래스의 메소드 선언

    // 공통으로 쓸, 구체적인건 구현을 해 놓는다.
   public void turnOn() {
        System.out.println("전원 On.");
    }

   public void turnOff() {
        System.out.println("전원 Off.");
    }

}
