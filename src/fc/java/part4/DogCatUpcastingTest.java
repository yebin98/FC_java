package fc.java.part4;

import fc.java.part4.model.Animal;
import fc.java.part4.model.Cat;
import fc.java.part4.model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        // Upcasting(업케스팅)
        // 부모가 자식을 가리킨다.
        //원하는 정확한 결과를 얻을 수 없다.
        Animal x=new Dog();
        x.eat(); // 동물처럼 먹다. -> 개처럼 먹다

        x=new Cat();
        x.eat();// 동물처럼 먹다. -> 고양이처럼 먹다
    }
}
