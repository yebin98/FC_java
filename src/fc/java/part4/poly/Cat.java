package fc.java.part4.poly;

public class Cat extends Animal {//Animal -> eat(){ ? }
    //재정의를 하지 않음 -> 오류 안남
    public void night(){
        System.out.println("밤에 눈에서 빛이 난다.");
    }

    //재정의(Override)
    @Override //있어도 되고 없어도 된다.
    public void eat() {
        System.out.println("고양이처럼 먹다");
    }
}
