package OOP03.ch16.gameLevel;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("Jump 를 할 수 없습니다ㅠ.ㅠ");
    }

    @Override
    public void turn() {
        System.out.println("Turn 을 할 수 없습니다ㅠ.ㅠ");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("==== 초급자 레벨 입니다. ====");
    }
}
