package fc.java.part4.poly;

public class Dog extends Animal {//Animal -> eat(); 추상메서드
    //불완전한 부모 메소드를 물려받으면 자식도 불완전한 객체가 됨 -> abstract 사용하면 되지만 abstract사용시 객체 생성 불가능
    //재정의(Override)를 반드시 해야 한다. -> 구형해야 한다.(부모에게 없는 바디({})를 만들면 된다.
    @Override
    public void eat() {
        System.out.println("개처럼 먹다");
    }

}
