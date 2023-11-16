package fc.java.part5;

import fc.java.part5.model.IntArray;

public class MyIntArrayTest {
    public static void main(String[] args){
        //Q . 정수 3개를 배열에 저장하고 출력하세요 => []
        IntArray list = new IntArray(); //5개 크기의 정수형 배열 객체 생성
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);//예외 발생 -> 배열의 길이를(2배로) 늘려주어야 한다.

        System.out.println(list.get(0)); // 1
        System.out.println(list.get(1)); // 2
        System.out.println(list.get(2)); // 3
        System.out.println();
        System.out.println(list.size()); // 3
        System.out.println();
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i)); // 3
        }
    }

}
