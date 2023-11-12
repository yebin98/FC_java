package fc.java.part4.model;

public class Cat extends Animal{
    //수평적 구조
//    public void eat(){
//        System.out.println("고양이처럼 먹다.");
//    }

    public Cat(){
        super();// new Animal();
    }
    public void night(){
        System.out.println("밤에 눈에서 빛이 난다.");
    }

    //재정의(Override)
    public void eat(){
        System.out.println("고양이처럼 먹다");
    }
}
