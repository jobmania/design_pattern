package _03.ch11_exam.mine;

import java.util.Random;

public class Player  {
    private PlayerLevel level;
    Random random = new Random();


    public Player(PlayerLevel level) {
        this.level = level;
    }

    public PlayerLevel getLevel() {
        return level;
    }



    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }

    public void play(){

        level.showLevelMessage();
        level.run();
        level.jump();
        level.turn();
        level.go(random.nextInt(5));
    }

}
