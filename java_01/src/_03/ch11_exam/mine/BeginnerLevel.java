package _03.ch11_exam.mine;

public class BeginnerLevel extends PlayerLevel {
    @Override
     void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
     void jump() {
        System.out.println("점프 못함");
    }

    @Override
     void turn() {
        System.out.println("턴 못함.");
    }

    @Override
     void showLevelMessage() {
        System.out.println("beginner ");
    }
}
