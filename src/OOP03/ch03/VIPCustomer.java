package OOP03.ch03;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;

//    public VIPCustomer() {
////        super();
//        // 부모클래스의 기본생성자를 생성시켜준다.
//        // 명시적으로 표기하지 않으면 컴파일러가 붙여준다.
//
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//    }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        // 부모클래스의 기본생성자가 매개변수를 갖는 기본생성자라면?
        // super(); 키워드를 이용해 명시적으로 부모클래스의 생성자를 호출해야 한다.

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer() invoked");

    }

    public int getAgentID() {
        return agentID;
    }
}
