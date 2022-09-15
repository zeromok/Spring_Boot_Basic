package OOP03.ch16.gameLevel;

public class Player {

    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    } // 기본 생성자 : 기능 : 하나의 레벨상태를 가질 수 있으므로, 초급자 레벨을 생성해 필드에 넣어줌

    public PlayerLevel getLevel() {
        return this.level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }
    public void play(int count) {
        level.go(count);
    }


}
