package OOP03.ch09;



public class ComputerTest {
    public static void main(String[] args) {

        //Computer desktop = new Desktop();
        Desktop desktop = new Desktop();
        //MyNoteBook myNoteBook = new MyNoteBook();
        Computer myNoteBook = new MyNoteBook();

        desktop.turnOn();
        desktop.display();
        desktop.typing();
        desktop.turnOff();

        myNoteBook.turnOn();
        myNoteBook.display();
        myNoteBook.typing();
        myNoteBook.turnOff();
    }
}
