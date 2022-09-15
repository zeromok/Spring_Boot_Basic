package OOP02.ch21;


// 배열의 얕은복사
public class ObjectCopyTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];


        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        System.arraycopy(library, 0, copyLibrary, 0, 5);
        // 객체의 인덱스가 가르키고 있는 주소값 까지 복사
        // 그래서 복사된 배열이 같은 주소값을 참조

//        System.out.println("==== library ====");
//        for (Book book : library){
//            System.out.println(book);
//            book.showInfo();
//        }
//
//
//        System.out.println("==== copyLibrary ====");
//        for (Book book : copyLibrary){
//            System.out.println(book);
//            book.showInfo();
//        }

        library[0].setAuthor("박완서");
        library[0].setTitle("나무");

        System.out.println("==== library ====");
        for (Book book : library){
            System.out.println(book);
            book.showInfo();
        }


        System.out.println("==== copyLibrary ====");
        for (Book book : copyLibrary){
            System.out.println(book);
            book.showInfo();
        }



    }
}
