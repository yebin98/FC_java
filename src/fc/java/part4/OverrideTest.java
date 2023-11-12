package fc.java.part4;

import fc.java.part4.model.Animal;
import fc.java.part4.model.Cat;
import fc.java.part4.model.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        //Upcasting(업케스팅) : Dog.java(x), Animal <---> Dog.class(o)
        Animal x=new Dog();
        x.eat(); //Animal -> 실행(동적바인딩) -> Dog

        x=new Cat(); //부모가 1명이니 위에서 선언했으므로 밑에는 선언 안해도 됨
        x.eat(); //Animal -> 실행(동적바인딩) -> Cat
    }
}
