package _03.ch11_exam.mine;

public class PlayerTest {
    public static void main(String[] args) {

        BeginnerLevel beginnerLevel = new BeginnerLevel();
        AdvanceLevel advanceLevel = new AdvanceLevel();
        SuperLevel superLevel = new SuperLevel();

        Player player = new Player(beginnerLevel);
        player.play();


        player.upgradeLevel(advanceLevel);
        player.play();

        player.upgradeLevel(superLevel);
        player.play();

    }
}
