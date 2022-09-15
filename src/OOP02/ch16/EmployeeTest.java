package OOP02.ch16;

// static 변수
public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setEmployeeName("이순신");

        System.out.println(Employee.getSerialNum());
        // 인스턴스. 으로는 잘 사용하지 않고, 클래스.static 변수명 으로 사용

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        Employee.getSerialNum();
        System.out.println(Employee.getSerialNum());
    }
}
