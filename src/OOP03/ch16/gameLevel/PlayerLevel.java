package OOP03.ch16.gameLevel;

import lombok.NoArgsConstructor;

@NoArgsConstructor
// 추상클래스의 기본생성자...!
public abstract class PlayerLevel {
    /*
    Player 가 있고 Player 는 GameLevel 속성을 가집니다. 각 GameLevel 단계 마다 run(), jump(), turn() 세 가지 기능이 업그레이드 됩니다.
    초보자 레벨 : 천천히 달립니다. run() 만 가능
    중급자 레벨 : 빠르게 달리고, 점프할 수 있습니다. run(), jump() 가능
    고급자 레벨 : 엄청 빠르게 달리고, 높게 점프하고, 턴할 수 있습니다. run(), jump(), turn() 가능
    Player 는 한번에 하나의 레벨 상태만을 가질 수 있습니다.
    Player 가 play() 중에 레벨에 있는 go(int count) 라는 메서드를 호출하면 run() 하고 count 횟수 만큼 jump() 하고 turn() 합니다.
    다음 클래스 다이어그램을 참고하여 각 레벨에서 go() 가 호출 될때 다음과 같이 출력 되도록 하세요.
    + Player 는 한 개의 level 변수를 가지고, 이는 PlayerLevel 형입니다.
    */

    /*
    == 정보 ==
    1. 초보자, 중급자, 고급자 레벨을 가지고 있다.
    2. Player 은 하나의 레벨상태만을 가질 수 있다.
    3. Player 가 play() 메소드사용 -> go(int count) 메소드 호출하면 run(), count 횟수만큼 jump(), turn()
    4. Player 은 한개의 PlayerLevel 타입의 변수 level 을 가지고 있다.

    == 과정 ==
    1. 모든 레벨의 공통 메소드를 묶어 상위클래스로 두자
        - run, jump, turn, showLevelMessage, go 메소드들을 선언한 추상클래스
    2. Player 클래스
        - PlayerLevel 타입의 변수 level 선언 => 필드
        - play 메소드 만들어서 go 메소드 호출
    3. PlayerLevel 의 메소드를 구현 할 초보자, 중급자, 고급자 레벨 클래스 생성
        -
    */

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();
    // 위 4개의 메소드는 추상메소드

     public void go(int count) {

        run();
        for(int i=0; i<count; i++) {
            jump();
        }
        turn();

    }// method
}
