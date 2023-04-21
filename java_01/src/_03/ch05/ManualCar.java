package _03.ch05;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람주행합니다.");
        System.out.println("사람이 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아서 정지합니다.");

    }

    @Override
    public void fuel() {
        System.out.println("수동주유"); // 추상함수로 무조건 구현해야함.

    }

    @Override
    public void washCar() {
        System.out.println("손세차합니다~"); // 추상함수가 아님
    }
}
