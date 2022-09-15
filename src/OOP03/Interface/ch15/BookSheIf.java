package OOP03.Interface.ch15;

public class BookSheIf extends SheIf implements Queue{
    @Override
    public void enQueue(String title) {
        sheIf.add(title);
    }// 상속받은 SheIf 객체의 sheIf 에 접근해 .add 사용해 ArrayList 에 들어온 파라미터를 넣어준다.

    @Override
    public String deQueue() {
        return sheIf.remove(0);
    }// 0번째 인덱스를 제거하고 그 값을 반환 1번인덱스가 0번으로 이동

    @Override
    public int getSize() {
        return getCount();
    }// getCount 의 리턴값은 .Size() 즉, 인덱스 개수 반환
}
