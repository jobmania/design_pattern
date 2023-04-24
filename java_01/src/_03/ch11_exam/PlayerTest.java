package _03.ch11_exam;

public class PlayerTest {
    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        AdvanceLevel advanceLevel = new AdvanceLevel();
        player.upgradeLevel(advanceLevel);
        player.play(2);

        SuperLevel superLevel = new SuperLevel();
        player.upgradeLevel(superLevel);
        player.play(3);
    }
}
