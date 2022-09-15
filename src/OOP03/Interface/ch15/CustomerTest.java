package OOP03.Interface.ch15;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buy = customer;
        buy.buy();
        buy.order();

        Sell sell = customer;
        sell.sell();
        sell.order();

    }
}
