package OOP03.ch09;

// 모두 구현하지 않고 일부분만 구현할 경우 abstract 붙여주기
public abstract class NoteBook extends Computer{

    @Override
    public void display() {
        System.out.println("NoteBook display");
    }

}
