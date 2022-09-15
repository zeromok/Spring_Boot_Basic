package OOP03.Interface.ch11;

public abstract class Calculator implements Calc{
    // 인터페이스가 완전히 구현이 되지 않았으므로, 추상클래스로 선언

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

}
