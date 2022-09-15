package OOP03.ch10;

public class MaunalCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아 차를 멈춥니다.");
    }

    @Override
    public void wiper() {
        System.out.println("와이퍼 작동");
    }
}
