package junit;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {

    public static void main(String[] args) {
        // 아래와 같이 생성해 값이 잘나오나 찍어보고 확인하는 과정을 테스트로 해보자

        // 원화 계산기
//        Calculator calculator = new Calculator(new CalculatorTest1());
//        log.info("calculator : {}", calculator);

        // 달러 계산기
        MarketApi api = new MarketApi(); // 여러 마켓이 될 수있음, naver, kakao, ... 의 달러 시세
        CalculatorTest2 dollar = new CalculatorTest2(api); // 생성자 주입을 통해 초기화
        dollar.init();

        Calculator calculator = new Calculator(dollar);
        log.info("calculator : {}", calculator);


    } // main()

} // end class
