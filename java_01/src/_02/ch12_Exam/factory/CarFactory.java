package _02.ch12_Exam.factory;



public class CarFactory {
    private static CarFactory instance = new CarFactory();
    private static int serialNum = 10000;

    private CarFactory(){
    }

    public static CarFactory getInstance(){
        if(instance == null){
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar(){
        Car car = new Car(++serialNum);
        return car;
    }

}
