package chapter06.prac;

public abstract class Decorator extends Coffee{
    // 혼자 수행 x , 매개변수 필요
    // 상속만을 위한 클래스.
    Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
