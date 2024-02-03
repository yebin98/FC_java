package fc.java.part5;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        //ArrayList에 10,20,30,40,50 5의 정수(int)를 저장하고 출력하세요
        //ArrayList -> Objeck[] <--x-- int
        //ArrayList -> Objeck[] <----- Integer(Wrapper)
        //ArrayList -> Objeck[] <--(Auto-boxing:Integer)-- int
        ArrayList<Integer> list = new ArrayList<Integer>(); //뒤에 Integer 는 생략가능
        list.add(new Integer(10));
        list.add(20);//new Integer(20)
        list.add(30);
        list.add(40);
        list.add(50);
        //      int <--(Auto-unboxing)-- Integer
        for(int data:list){
            System.out.println(data);
        }
    }
}
