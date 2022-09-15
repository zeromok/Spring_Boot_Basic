package Generic.OOP06.unused;

public class ThreeDPrinterTest {

    public static void main(String[] args) {

        ThreeDPrinter threeDPrinter = new ThreeDPrinter();
        Powder powder = new Powder();

        threeDPrinter.setMaterial(powder);

        Powder p = (Powder) threeDPrinter.getMaterial();
        System.out.println(p);

        /*
            Object 를 사용하면 넣을 때는 상관 없으나(모두 자식들이니...)
            꺼낼 때 문제가 발생(강제 형변환) 이는 큰 메모리 손실
            그래서 제네릭을 사용하는 쪽으로 문제를 해결해 보자
        */
    }
}// end class
