package Generic.OOP08;

public class GenericMethod {

    /*
        두 점(top, bottom)을 기준으로 사각형을 만들 때 사각형의 너비를 구하는 메서드를 만들어 보자
        두 점은 정수인 경우도 있고, 실수인 경우도 있으므로 제네릭 타입을 사용하여 구현한다.
    */

    public static <X, Y> double makeRectangle(Point<X, Y>p1, Point<X, Y>p2) {

        double left = ((Number)p1.getX()).doubleValue();
        double right =((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();

        double width = right - left;
        double height = bottom - top;

        return width * height;

    }

    public static void main(String[] args) {

        Point<Integer, Double> p1 = new Point<>(0, .0);
        Point<Integer, Double> p2 = new Point<>(10, 10.0);

        double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
        System.out.println(rect);

    }
}// end class
