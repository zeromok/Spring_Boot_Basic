package OOP05.ch02_Array;

public class MyArray {

    public static final int ERROR_NUM = -999999999;
    // final 선언 : 한 번의 초기화, 변경불가

    int[] intArr;
    // 기본 접근제어자 : 같은 패키지 내부에서만 접근 가능

    int count;
    // 기본 접근제어자 : 같은 패키지 내부에서만 접근 가능

    public int ARRAY_SIZE;
    // public : 클래스 외부 어디서나 접근 가능

    public MyArray() {

        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }
    // 생성자 : 인스턴스의 변수를 초기화 시키는 역할


    public MyArray(int size) {

        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[ARRAY_SIZE];
    }
    // 매개변수를 받는 생성자 : 매개변수 size 를 받아 초기화


    public void addElement(int num) {

        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory");

            return;
            // return : 해당 메소드의 진행을 멈추고 빠져나온다.
        }

        intArr[count++] = num;
        // count++ : count 값을 사용한 후 1증가 즉, 0 사용 다음 1

    }// addElement() : 반환값이 없는 메소드

    public void insertElement(int position, int num) {


        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
            return;
        }
        // 인덱스 > 배열의 사이즈 : 즉 ,들어갈 자리가 없다면...

        if (position < 0 || position > count) {
            System.out.println("INSERT ERROR");
            return;
        }// 들어온 position(인덱스 값이 될 예정) 값이 0보다 작거나 기존 인덱스보다 크다면 에러 발생

        for (int i = count - 1; i >= position; i--) {
            // count - 1 : 현재 생성된 배열의 맨 마지막 인덱스

             intArr[i+1] = intArr[i];
            // 들어 올 자리부터 그 이후는 한 칸씩 밀어 놓아야 한다.

        }

        intArr[position] = num;
        count++;

    }// insertElement()


    public int removeElement(int position) {

        int ret = ERROR_NUM;

        if (isEmpty()) {
            System.out.println("There is no element");
            return ret;
        }

        if (position < 0 || position >= count) {
            System.out.println("remove Error");
            return ret;
        }

        ret = intArr[position];

        for (int i = position; i < count-1; i++) {
            intArr[i] = intArr[i + 1];
        }

        count--;
        return ret;

    }// removeElement()



    public boolean isEmpty() {
        if (count == 0) {

            return true;
        }else {
            return false;
        }
    }// isEmpty()

    public void printAll() {
        if (count == 0) {
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(intArr[i]);
        }
    }


    public int getElement(int position)
    {
        if(position < 0 || position > count-1){
            System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
            return ERROR_NUM;
        }
        return intArr[position];
    }


}// end class
