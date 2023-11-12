package fc.java.part4.model;

public class Animal extends Object{
    public Animal(){
        super(); // new Object();
    }
    //수직적 구조
    public void eat(){
        System.out.println("동물처럼 먹다?");// 추상적인 표현
    }

}
