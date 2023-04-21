package _03.ch05;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("자율주행합니다.");
        System.out.println("스스로 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아서 정지합니다.");
    }

    @Override
    public void fuel() {
        System.out.println("ai는 자동주유");
    }
}
