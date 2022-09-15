package OOP04.ch03;

public class StrintTest {

    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");

        java = java.concat(android);

        System.out.println(java);

        // 자바, 안드로이드, 이 둘을 연결한 객체 java 3개 모두 주소값이 다르다.
        // 이렇게 되면 메모리 낭비가 심하니 StringBuilder, StringBuffer 을 쓰자

    }
}
