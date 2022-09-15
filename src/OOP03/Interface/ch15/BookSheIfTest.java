package OOP03.Interface.ch15;

public class BookSheIfTest {

    public static void main(String[] args) {

        Queue bookQueue = new BookSheIf();
        bookQueue.enQueue("토지1");
        bookQueue.enQueue("토지2");
        bookQueue.enQueue("토지3");
        bookQueue.enQueue("토지4");
        bookQueue.enQueue("토지5");

        System.out.println(bookQueue.getSize());

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.getSize());

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.getSize());

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.getSize());

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.getSize());

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.getSize());

    }
}
