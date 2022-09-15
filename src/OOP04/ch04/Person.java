package OOP04.ch04;

public class Person {

    private String name;
    private int age;

    public Person() {;;}
    // 기본생성자

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    // 필드를 모두 매개변수로 받는 생성자

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name;
    }
}
