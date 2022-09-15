package OOP03.Interface.ch14;

public interface Calc {
    /*
    인터페이스의 여러가지 요소
    - default method
    - static method
    - private method
    */

    double PI = 3.14;
    int ERROR = -9999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod();
    }

    static int total(int[] arr) {

        int total = 0;
        for(int num : arr) {
            total += num;
        }
        myStaticMethod();
        return total;
    }

    private void myMethod() {
        System.out.println("myMethod");
    }
    /*
    private method
    - 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음
    - 인터페이스 내부에서만 사용하기 위해 구현하는 메소드
    - default 메소드나 static 메소드에서 사용
    */

    private static void myStaticMethod() {
        System.out.println("myStaticMethod");
    }

}
