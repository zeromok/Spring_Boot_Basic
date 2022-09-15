package OOP03.ch10;

public class CarTest {
    public static void main(String[] args) {

        Car aiCar = new AICar();
//        AICar aiCar = new AICar();
        aiCar.run();

        Car mCar = new MaunalCar();
        mCar.run();
    }
}
