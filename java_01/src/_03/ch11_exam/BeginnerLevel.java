package _03.ch11_exam;

public class BeginnerLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프 x");
    }

    @Override
    public void turn() {
        System.out.println("턴 x");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("레벨 beginner");

    }
}
