package fc.java.part4;

import fc.java.part4.model.*;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        // Dog와 Cat을 저장하는 배열을 생성(서로 다른 타입 배열 -> 부모타입으로 만들면 됩)
//        Animal[] ani = {new Dog(), new Cat()}; -> 이렇게 만들어도 됨

        //다형성 배열
        Animal[] ani=new Animal[2];
        ani[0]=d;
        ani[1]=c;
        display(ani);
    }

    public static void display(Animal[ ] ani){
        for(int i=0;i<ani.length;i++){
            ani[i].eat();
            if(ani[i] instanceof Cat){
                ((Cat)ani[i]).night();
            }

        }
    }
}
