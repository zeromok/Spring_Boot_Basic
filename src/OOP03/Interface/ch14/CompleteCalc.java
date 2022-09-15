package OOP03.Interface.ch14;

public class CompleteCalc extends Calculator {
     /*
    인터페이스의 여러가지 요소
    - default method
    - static method
    - private method
    */

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 == 0){
            return ERROR;
        }

        return num1 / num2;
    }

    public void showInfo() {

        System.out.println("모두 구현했습니다.");

    }

//    @Override
//    public void description() {
//        System.out.println("재정의 된 메소드");
//    }
}
