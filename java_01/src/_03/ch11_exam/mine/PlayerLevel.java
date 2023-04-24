package _03.ch11_exam.mine;

import java.util.Random;

public abstract class PlayerLevel {

    void run() {
    }

    void jump() {
    }

    void turn() {
    }

    void showLevelMessage() {
    }

    void go(int i) {

        for (int j = 0; j < i; j++) {
            Random random = new Random();
            int num = random.nextInt(3);  // 0 ~ 2

            switch (num) {
                case 0:
                    run();
                    break;
                case 1:
                    jump();
                    break;
                case 2:
                    turn();
                    break;

            }

        }
    }
}
