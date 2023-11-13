package fc.java.part4;

import fc.java.part4.model.Animal;
import fc.java.part4.model.Cat;
import fc.java.part4.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        //Animal --> Dog, Cat
        Animal ani = new Dog();
        ani.eat();//호출한다 -> 메세지를 보낸다. => 다르게 반응함(다형성)

        ani = new Cat();//업케스팅
        ani.eat();//호출한다 -> 메세지를 보낸다. => 다르게 반응함(다형성)
//        ani.night(); //못가져온다. -> 위의 타입이 Animal이기 때문에 Cat타입에 있는 night를 가져올수 없다. => 형변환해야함(다운케스팅)
//        Cat c = (Cat)ani;
//        c.night();
        ((Cat)ani).night();
    }
}
