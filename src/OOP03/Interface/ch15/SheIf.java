package OOP03.Interface.ch15;

import java.util.ArrayList;

public class SheIf {
    /*
    클래스 상속과 인터페이스 구현 함께 쓰기
    == 책이 순서대로 대여가 되는 도서관 구현 ==
        책을 보관하는 자료구조가 SheIf 에 구현됨(ArrayList)
        Queue 인터페이스를 구현함
        SheIf 클래스를 상속 받고 Queue 를 구현한다.
    */

    protected ArrayList<String> sheIf;
    // 같은 클래스, 상속관계 클래스 접근가능

    public SheIf() {
        sheIf = new ArrayList<>();
    }// 기본생성자 : ArrayList 구현

    public ArrayList<String> getSheIf() {
        return sheIf;
    }// 리턴값이 ArrayList 인 메소드 => 어떤 책이 들어있는지 반환

    public int getCount() {
        return sheIf.size();
    }// 리턴값이 int 인 메소드 => 도서관의 책 개수 반환

}
