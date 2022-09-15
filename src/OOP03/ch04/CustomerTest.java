package OOP03.ch04;

public class CustomerTest {


    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");

//        customerLee.setCustomerName("이순신");
//        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + price);

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");

//        customerKim.setCustomerName("김유신");
//        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        int price1 = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo() + price1);

        Customer vc = new VIPCustomer(12345, "noname");
        System.out.println(vc.calcPrice(1000));     // 900
        // 상위클래스 타입으로 하위클래스 인스턴스를 만듦
        // 가상메소드 방식
        // - 인스턴스의 실제 메소드 호출

    }
}
