package OOP05.ch02_Array;

public class MyArrayTest {
    public static void main(String[] args) {

        MyArray array = new MyArray();
        // 매개변수 없는 기본생성자로 생성 기본값 10

        array.addElement(10);   // array[0]
        array.addElement(20);   // array[1]
        array.addElement(30);   // array[2]

        array.insertElement(1, 50);

        array.printAll();

        System.out.println("===============");

        array.removeElement(1);
        array.printAll();

        System.out.println("===============");

        array.addElement(70);
        array.printAll();

        System.out.println("===============");

        array.removeElement(1);
        array.printAll();

        System.out.println("===============");
        System.out.println(array.getElement(2));



    }
}
