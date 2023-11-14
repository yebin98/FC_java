package fc.java.part4;

import fc.java.part4.poly.*;

public class IsNotOverride {
    public static void main(String[] args) {
        // 재정의를 하지 안했기 떄문에 -> 부모가 명령을 내리면(메세지를 보내면) 오작동을 한다.
        // 다형성을 보장하지 않음 -> 다형성을 보장할려면 => 재정의를 하도록 강제로 만들어주면 된다.
        //==> 추상클래스, 인터페이스 등장
        // 다형성이 보장이 된다.
        Animal ani = new Dog();
        ani.eat();// ?
        
        ani = new Cat();
        ani.eat();// ?
    }
}
