package OOP02.ch19;


// 자동차 공장이 있습니다. 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는 제작될 때마다 고유의 번호가 부여됩니다.
// 자동차 번호가 10001부터 시작되어 자동차가 생산될 때마다 10002, 10003 이렇게 번호가 붙도록 자동차 공장 클래스, 자동차 클래스를 구현하세요
// 다음 CarFactoryTest.java 테스트 코드가 수행 되도록 합니다.

public class CarFactory {
    private static CarFactory Factory = new CarFactory();

    // 기본생성자를 만들지 않으면 new 을 이용해 인스턴스를 만들 수 있기 때문에
    // 싱글톤 패턴에 위배, 그래서 여기서 만들고 private 보호
    private CarFactory() {;;}

    // static 메소드 : 메소드를 통해서만 만들어진 인스턴스 전달
    public static CarFactory getInstance() {
        if(Factory == null) {
            Factory = new CarFactory();
        }
        return Factory;
    }

    public Car createCar() {

        Car car = new Car();
        return car;
    }





}
