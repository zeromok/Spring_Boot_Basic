package OOP02.ch04;

public class StudentTest {

    public static void main(String[] args) {

        int num = 10;
        // int 는 선언하자마자 4바이트가 잡혀있다.

        Student studentLee = new Student();
        // 객체인 경우 꼭 생성자 써주기 : Heap 에 인스턴스 생성

        studentLee.studentID = 1234;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentID = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 성남시";

        studentKim.showStudentInfo();

        // 힙에 자리잡은 인스턴스 주소를 가르킨다.
        System.out.println(studentLee);
        System.out.println(studentKim);



    }
}
