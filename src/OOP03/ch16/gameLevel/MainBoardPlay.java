package OOP03.ch16.gameLevel;


public class MainBoardPlay {


    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);
        System.out.println(player.getLevel());

        AdvancedLevel aPlayer = new AdvancedLevel();
        player.upgradeLevel(aPlayer);
        player.play(2);
        System.out.println(player.getLevel());

        SuperLevel sPlayer = new SuperLevel();
        player.upgradeLevel(sPlayer);
        player.play(3);
        System.out.println(player.getLevel());


    }
}
