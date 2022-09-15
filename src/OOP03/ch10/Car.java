package OOP03.ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public abstract void wiper();
    public void starCar() {
        System.out.println("시동 On");
    }

    public void turnOff() {
        System.out.println("시동 Off");
    }

    final public void run() {
        starCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
