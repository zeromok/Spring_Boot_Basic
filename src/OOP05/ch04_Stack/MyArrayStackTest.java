package OOP05.ch04_Stack;

public class MyArrayStackTest {

    public static void main(String[] args) {

        MyArrayStack myArrayStack = new MyArrayStack(3);

        myArrayStack.push(10);
        myArrayStack.push(20);
        myArrayStack.push(30);
        myArrayStack.push(40);

        myArrayStack.printAll();

        System.out.println(myArrayStack.pop());
        System.out.println(myArrayStack.pop());

        System.out.println(myArrayStack.peek());


    }
}
