package OOP05.ch04_Stack;

import OOP05.ch02_Array.MyArray;

public class MyArrayStack {

    MyArray arrayStack;
    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }// 생성자

    public MyArrayStack(int size) {
        arrayStack = new MyArray(size);
    }// 생성자


    public void push(int data) {
        if(isFull()) {
            System.out.println("stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }// push()


    public int pop() {

        if(top == 0) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }

        return arrayStack.removeElement(--top);
    }// pop()


    public int peek() {
        if(top == 0) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(top-1);
    }// peek()


    public int getSize() {
        return top;
    }// getSize()


    public boolean isFull() {
        if(top == arrayStack.ARRAY_SIZE) {
            return true;
        }
        return false;
    }// isFull()


    public boolean isEmpty() {
        if(top == 0) {
            return true;
        }
        return false;
    }// isEmpty()


    public void printAll() {
        arrayStack.printAll();
    }// printAll()


}// end class
