package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        // Q. 한 [사람]의 데이터를 저장할 [변수를 선언]하세요.
//        Person p; -> p: 객체변수

        //Q. 사람의 이름, 나이, 전화번호를 저장할 객체를 생성하세요.
//       p = new Person(); -> new : new연산자, Person() : 생성자 메서드(),  new Person() : 인스턴스

        //Q. 생성된 객체를 변수에 할당(대입,저장) 하세요.
        //Q. 모델링 된 Person클래스를 이용하여 객체를 메모리에 생성하세요.
        //인스턴스를 만드는 과정
        Person p = new Person(); // -> p : 인스턴스 변수

        //Q. 이름, 나이, 전화번호를 저장하고 출력하세요.
        p.name = "홍길동";
        p.age = 30;
        p.phone = "010-1111-1111";
        System.out.println(p.name + "\t" + p.age + "\t" + p.phone + "\t");

        //Q. play(), eat(), walk() 동작을 호출하여 실행하세요
        p.play();
        p.eat();
        p.walk();

    }
}
