package _03.ch11_exam;

import java.util.Random;

public abstract class PlayerLevel {

    public abstract void run();

    public abstract void jump();

    public abstract void turn();
    public abstract void showLevelMessage();

    public final void go(int count) {
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }
}
