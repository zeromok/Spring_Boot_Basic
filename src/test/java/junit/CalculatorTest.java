package junit;


import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Log4j2
@ExtendWith(MockitoExtension.class) // Mocking 을 할 수 있는 환경을 만든다.
public class CalculatorTest {

    @Mock
    public MarketApi marketApi;

    @BeforeEach // 테스트 실행 이전에
    public void init() {
        // marketApi 의 connect() 가 수행될 때, 3000 리턴 할꺼야 (직접 통신하지 않고 그 상황을 만들어줌)
        Mockito.lenient().when(marketApi.connect()).thenReturn(3000);
    }

    @DisplayName("1. DollarTest")
    @Test
    void DollarTest(){

        MarketApi marketApi = new MarketApi();
        CalculatorTest2 dollar = new CalculatorTest2(marketApi);
        dollar.init();

        Calculator calculator = new Calculator(dollar);

        log.info("DollarTest - expected(기대값) : {}", calculator.sum(10, 10));
        Assertions.assertEquals(22000, calculator.sum(10, 10));
        Assertions.assertEquals(0, calculator.minus(10, 10));

    }

    @DisplayName("2. Mock")
    @Test
    void MockTest(){

        CalculatorTest2 dollar = new CalculatorTest2(marketApi);
        dollar.init();

        Calculator calculator = new Calculator(dollar);

        log.info("MockTest - expected(기대값) : {}", dollar.sum(10, 10));
        Assertions.assertEquals(60000, calculator.sum(10, 10));
        Assertions.assertEquals(0, calculator.minus(10, 10));

    }

} // end class
