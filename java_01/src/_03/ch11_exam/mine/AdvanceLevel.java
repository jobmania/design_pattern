package _03.ch11_exam.mine;

public class AdvanceLevel extends PlayerLevel {

    @Override
     void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("높이 점프합니다.");
    }

    @Override
    void turn() {
        System.out.println("점프 못함.");

    }

    @Override
   void showLevelMessage() {
        System.out.println("advance ");
    }
}
