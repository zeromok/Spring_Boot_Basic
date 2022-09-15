package OOP03.ch03;

public class Customer {

//    회사에서 고객 정보를 활용한 맞춤 서비스를 하기 위해 일반고객(Customer)과
//    이보다 충성도가 높은 우수고객(VIPCustomer)에 따른 서비스를 제공하고자 함
//
//    물품을 구매 할때 적용되는 할인율과 적립되는 보너스 포인트의 비율이 다름
//    여러 멤버십에 대한 각각 다양한 서비스를 제공할 수 있음
//    멤버십에 대한 구현을 클래스 상속을 활용하여 구현해보기


    protected int CustomerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

//    public Customer() {
//
//        customerGrade = "SILVER";
//        bonusRatio = 0.01;
//    }

    public Customer(int customerID, String customerName) {

        this.CustomerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer() invoked");
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int clacPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "점 입니다.";
    }


}
