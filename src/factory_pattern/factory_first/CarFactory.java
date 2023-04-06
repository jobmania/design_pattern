package factory_pattern.factory_first;

public class CarFactory {
    // 여기서 car를 생성
    public Car createCar(String productName){
        Car car = null;
        if(productName.equalsIgnoreCase("sonata")){
            car = new Sonata(productName);
        } else if (productName.equalsIgnoreCase("genesis")) {
            car = new Genesis(productName);
        } else if (productName.equalsIgnoreCase("grandeur")){
            car = new Grandeur(productName);
        }
        return car;
    }
}
