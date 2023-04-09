package factory_pattern.factory_second;


public class CarTest {

    /** // 클라이언트 코드 !!! (실행)
        // 차가 추가된다하더라도 클라이언트는 변경없이 CarFactory만 수정하면된다.
     * */
    public static void main(String[] args) {

        CarTest test = new CarTest();
        Car car = test.produceCar("Sonata");

        Car car2 = test.produceCar("genesis");
        System.out.println("car = " + car);
        System.out.println("car2 = " + car2);
    }

    public Car produceCar(String name) {
        Car car = null;
        CarFactory carFactory = new HyundaiFactory(); //
        car = carFactory.createCar(name); // 어느 공장을 선택하거나 동일한 작업인 ㅇ왜 why? factory 에서 상속받을것이기대문!
        return car;
    }

    //

}
