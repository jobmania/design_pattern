package _03.ch04;

public class DeskTop extends Computer{
    @Override
    public void display() {
        System.out.println("desktop displaying");
    }

    @Override
    public void typing() {
        System.out.println("desktop typing");
    }

    @Override
    public void turnOn() {
        System.out.println("desktop 전원 on");
    }

    @Override
    public void turnOff() {
        System.out.println("desktop 전원 off");
    }
}
