package OOP02.ch12;

// this
public class Person {

    String name;
    int age;

    public Person() {

        // 아래의 생성자와 똑같이 초기화 하고싶을때는 다른생성자를 불러올 수 있다.
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson() {
        return this;
    }

    public void showPerson() {
        System.out.println(name + "," + age);
    }


    public static void main(String[] args) {

        Person p = new Person();
        p.name = "James";
        p.age = 37;

        Person p2 = p.getPerson();

        p.showPerson();
        System.out.println(p);
        System.out.println(p2);
    }
}
