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
        CarFactory carFactory = new CarFactory();
        car = carFactory.createCar(name);
        return car;
    }

    //

}
