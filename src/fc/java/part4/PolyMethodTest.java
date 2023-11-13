package fc.java.part4;

import fc.java.part4.model.*;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d=new Dog();
        display(d);
        Cat c=new Cat();
        display(c);
    }

    //overloding
    // -> 타입이 늘어나면 display() 메서드도 늘어난다.
//    public static void display(Dog d){
//        d.eat();
//    }
//    public static void display(Cat c){
//        c.eat();
//    }

    public static void display(Animal ani){ //다형성 인수
        ani.eat();

        // ani.night(); // 오류(x) -> Cat의 고유한 기능
        //((Cat)ani).night(); // 다운케스팅시 Dog에는 없기 때문에 단독 사용 불가능 => Cat타입으로 받는경우에만 실행(if문)
        if(ani instanceof Cat){
            ((Cat)ani).night(); //Cat
        }
    }
}
