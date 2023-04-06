package factory_pattern.factory_before;

public class CarTest {
    // 클라이언트 코드 !!! (실행)

    public static void main(String[] args) {

        CarTest test = new CarTest();
        Car car = test.produceCar("Sonata");

        System.out.println(car);
    }

    public Car produceCar(String name) {

        /**

        // 만약 차가 추가 된다면 .... 점점 코드가 기하 급수적으로 늘어남, 만약 다른 곳에서도 동일한 로직이 있다면????
        // => 분류코드를 사용함. 생성하는 인스턴스가 증가면 코드가 점점 길어짐
        */

        Car car = null;
        if( name.equalsIgnoreCase(Car.SONATA)) {
            car = new Car(Car.SONATA);
        }
        else if( name.equalsIgnoreCase(Car.GRANDEUR)) {
            car = new Car(Car.GRANDEUR);
        }
        else if( name.equalsIgnoreCase(Car.GENESIS)) {
            car = new Car(Car.GENESIS);
        }
        else {
            car = new Car("noname");
        }

        return car;
    }

}
