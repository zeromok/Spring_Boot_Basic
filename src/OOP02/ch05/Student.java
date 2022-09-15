package OOP02.ch05;

public class Student {
    public int studentNumber;
    public String studentName;
    public int grade;

    public Student(){
        System.out.println("student 생성");
    }
    // 기본 생성자

    public Student(int studentNumber, String studentName, int grade) {
        System.out.println("student 생성");

        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }
    // 매개변수를 받아 멤버변수 초기화


    public String showStudentInfo() {

        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
        // null 학생의 학번은 0이고, 0학년 입니다.
    }
    // 멤버변수를 활용한 메소드
}
