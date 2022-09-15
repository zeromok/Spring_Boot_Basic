package OOP02.ch14;

public class TakeTransTest {

//    James 와 Tomas 는 각각 버스와 지하철을 타고 학교에 갑니다.
//    James 는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
//    Tomas 는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.
//
//    두 학생이 버스와 지하철을 타는 상황을 구현해 봅시다.
    public static void main(String[] args) {

        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);
        Student studentE = new Student("Edward", 20000);

        Bus bus = new Bus(100);
        Subway subway = new Subway(2);
        Tax tax = new Tax("잘 간다 운수");

        studentJ.takeBus(bus);
        studentT.takeSubway(subway);
        studentE.takeTax(tax);

        studentJ.showInfo();
        studentT.showInfo();
        studentE.showInfo();

        bus.showBusInfo();
        subway.showSubwayInfo();
        tax.showTaxInfo();


    }
}
