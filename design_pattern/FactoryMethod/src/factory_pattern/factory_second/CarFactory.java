package factory_pattern.factory_second;

public abstract class CarFactory {
    // 일련의 과정 , 논리적인 과정들을 상위 클래스에서 정의하면 하위 클래스에서 구체화 <-- 템플릿 메서드.
    final public Car manufacturingCar(String name){
        // 인스턴스 생성을 위한 팩토리 메서드!!
        Car car;
        preparingOther();
        car = createCar(name);
        washCar();

        return car;
    }

    public void washCar() {
        System.out.println(" wash Car!!");
    }

    public void preparingOther() {
        System.out.println("preparingOthers!!");
    }

    // 하위 팩토리에서 명시됨
    public abstract Car createCar(String name);


}
