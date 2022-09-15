package OOP03.ch06;

import java.util.ArrayList;

public class CustomerTest {


    public static void main(String[] args) {

        ArrayList<Customer> arrayList = new ArrayList<>();

        // 상위클래스를 이용한 하위클래스 핸들링
        Customer customerA = new Customer(10010, "Adam");
        Customer customerB = new Customer(10020, "Baby");
        Customer customerC = new GoldCustomer(10030, "Can");
        Customer customerD = new GoldCustomer(10040, "Daniel");
        Customer customerE = new VIPCustomer(10050, "End");

        arrayList.add(customerA);
        arrayList.add(customerB);
        arrayList.add(customerC);
        arrayList.add(customerD);
        arrayList.add(customerE);

//        for (Customer customer : arrayList) {
//            System.out.println(customer.showCustomerInfo());
//        }

        int price = 10000;
        for (Customer customer : arrayList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.customerGrade + "등급의 " + customer.getCustomerName() + "님이 " + cost + "원을 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
        }//end for
    }// end main
}// end class
