package OOP05.ch03_Link;

public class MyListNode {

    private String data;
    public MyListNode next;

    public MyListNode() {
        data = null;
        next = null;
    }// 기본 생성자

    public MyListNode(String data) {
        this.data = data;
        this.next = null;
    }// 매개변수 1

    public MyListNode(String data, MyListNode link) {
        this.data = data;
        this.next = link;
    }// 매개변수 2

    public String getData() {
        return data;
    }// getter


}// end class
