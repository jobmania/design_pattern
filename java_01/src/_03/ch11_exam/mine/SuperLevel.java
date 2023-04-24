package _03.ch11_exam.mine;

public class SuperLevel extends PlayerLevel {

    @Override
     void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
     void jump() {
        System.out.println("점프 개잘핵");
    }

    @Override
     void turn() {
        System.out.println("턴도 개잘핵.");
    }

    @Override
     void showLevelMessage() {
        System.out.println("Super ");
    }
}
