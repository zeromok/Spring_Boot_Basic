package OOP02.ch24;


// 1001학번 Lee 와 1002학번 Kim, 두 학생이 있습니다.
// Lee 학생은 국어와 수학 2과목을 수강했고, Kim 학생은 국어, 수학, 영어 3 과목을 수강하였습니다.
// Lee 학생은 국어 100점, 수학 50점입니다.
// Kim 학생은 국어 70점, 수학 85점, 영어 100점입니다.
// Student 와 Subject 클래스를 만들고 ArrayList 를 활용하여 두 학생의 과목 성적과 총점을 출력하세요

import java.util.ArrayList;

public class Student {

   int studentId;
   String studentName;
   ArrayList<Subject> subjectList;
   // 학생마다 수강하는 과목 수가 다를 수 있기 때문에 ArrayList 를 사용한다.

   // 매개변수가 있는 생성자를 이용해 초기화
   public Student(int studentId, String studentName) {
       this.studentId = studentId;
       this.studentName = studentName;

       subjectList = new ArrayList<Subject>();
   }

   // 위 생성자를 이용해 subjectList 는 초기화 되었으므로, ArrayList 의 메소드 사용가능
   // 메소드 : 과목의 이름과 점수를 추가
   public void addSubject(String name, int score) {
       Subject subject = new Subject();

       subject.setName(name);
       subject.setScorePoint(score);

       subjectList.add(subject);
   }

   public void showStudentInfo() {
       int total = 0;

       for(Subject s : subjectList) {
           total += s.getScorePoint();
           System.out.println("학생 " + studentName + "의 " + s.getName() + "과목 성적은 " + s.getScorePoint() + "점 입니다.");
       }

       System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
   }


}
