package OOP03.Interface.ch14;

public class CalculatorTest {
    public static void main(String[] args) {
         /*
    인터페이스의 여러가지 요소
    - default method
    - static method
    - private method
    */

        int num1 = 10;
        int num2 = 2;

        //Calc calc = new CompleteCalc();
        CompleteCalc calc = new CompleteCalc();

        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        calc.description();
        // 인터페이스의 기본메소드 로써 메소드, 인터페이스를 구현하는 모든 클래스들에서 공통으로 사용가능
        // 인터페이스를 구현하는 클래스에서 재정의할 수 있다.


        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));
        // Calc.total(); : 인터페이스의 정적메소드 로써 인스턴스 생성과 상관없이 인터페이스 타입으로 사용가능



    }
}
