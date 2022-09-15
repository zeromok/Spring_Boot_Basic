package OOP02.ch23;

import OOP02.ch21.Book;
import java.util.ArrayList;

// ArrayList 예제
public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();
        // 기본으로 10개의 공간을 가진다.

        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥2", "조정래"));
        library.add(new Book("태백산맥3", "조정래"));
        library.add(new Book("태백산맥4", "조정래"));
        library.add(new Book("태백산맥5", "조정래"));

        for(int i=0; i< library.size(); i++) {
            library.get(i).showInfo();
        }

    }// end main
}// end class
