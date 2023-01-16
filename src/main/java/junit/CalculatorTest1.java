package junit;

public class CalculatorTest1 implements ICalculator{
    // 원화 계산을 위한 클래스 junit.ICalculator 를 구현해 테스트

    private int price = 1;

    @Override
    public int sum(int x, int y) {

        x *= price;
        y *= price;

        return x + y;
    }

    @Override
    public int minus(int x, int y) {

        x *= price;
        y *= price;

        return x - y;
    }
} // end class
