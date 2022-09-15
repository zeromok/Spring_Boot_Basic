package OOP02.ch14;

// 버스타고 학교가는 학생의 과정
// 객체 협력
public class Student {

    String studentName;
    int money;


    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void takeTax(Tax tax) {
        tax.take(10000);
        this.money -= 10000;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
