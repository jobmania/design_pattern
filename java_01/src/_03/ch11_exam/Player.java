package _03.ch11_exam;

import java.util.Random;

public class Player {

    private PlayerLevel level;

    public Player(){
        this.level = new BeginnerLevel();
        level.showLevelMessage();
    }
    public PlayerLevel getLevel( ) {
        return level;
    }

    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count){
        level.go(count);
    }
}
