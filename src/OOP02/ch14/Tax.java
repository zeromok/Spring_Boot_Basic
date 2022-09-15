package OOP02.ch14;

public class Tax {
    String taxName;
    int money;

    public Tax(String taxName) {
        this.taxName = taxName;
    }

    public void take(int money) {
        this.money += money;

    }


    public void showTaxInfo() {
        System.out.println(taxName + " 택시 수입은 " + money + "입니다.");
    }
}
