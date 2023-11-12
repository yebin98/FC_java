package fc.java.part4.model;

public class Dog extends Animal{
    //수평적 구조
//    public void eat(){
//        System.out.println("개처럼 먹다.");
//    }
    //생략가능
    public Dog(){
        super(); //new Animal() -> 부모가 먼저 만들어 져야 함 그래서 첫번째 줄에 작성해야 함
        int a = 10; //수행문
    }

    //재정의(Override)
    public void eat(){
        System.out.println("개처럼 먹다");
    }

}
