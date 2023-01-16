package junit;

public class CalculatorTest2 implements ICalculator{
    // 달러 계산을 위한 클래스 junit.ICalculator 를 구현해 테스트

    private int price = 1;
    private MarketApi marketApi;
    public CalculatorTest2(MarketApi marketApi) {
        this.marketApi = marketApi;
    }

    public void init() {
        // connect() 를 통해 현재 달러의 환율을 초기화

//        this.price = connect();
        this.price = marketApi.connect(); // 분리된 클래스에서 가져와 초기화
    }

    // 계산 기능을 하는 해당 클래스와는 맞지 않으니 분리시키자
//    public int connect() {
//        // 외부 서비스와의 통신을 통해 환율을 가져왔다 치고
//
//        return 1100;
//    }

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
