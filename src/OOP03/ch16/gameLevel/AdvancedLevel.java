package OOP03.ch16.gameLevel;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 점프 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 을 할 수 없습니다ㅠ.ㅠ");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("==== 중급자 레벨 입니다. ====");
    }
}
