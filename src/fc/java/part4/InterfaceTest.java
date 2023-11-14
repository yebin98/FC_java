package fc.java.part4;

import fc.java.part4.poly.*;

public class InterfaceTest {
    public static void main(String[] args) {
        //Q. 만약 서로 다른 동작을 가지는 클래스를 상속관계로 만들어서 동작을 시켜야 한다고 가정해보자.추상클래스 이용

        // 다형성 100%보장된다.
        //부모가 인터페이스이면 자식의 내부 동작방식을 전혀 몰라도 동작을 시킬 수 있다.
        //RemoCon remo = new RemoCon(); 인터페이스도 객체 생성 불가능하다.(인스턴스를 만들 수 없다.)
        //부모의 역할을 할 수 있다.
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet(); //Radio에서는 인터넷이 실행되지 않는다.

        remo = new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet(); //TV에서는 인터넷이 실행된다.
    }
}
