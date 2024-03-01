package fc.java.part6;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // new ArrayList<String> String생략 가능 String[]
        list.add("apple"); //list.add(new String("apple"));
        list.add("banana");
        list.add("cherry");
        list.add("banana"); // 중복 데이터 추가

        // 데이터 삭제
        list.remove(0); // 첫 번째 데이터 삭제

        // 데이터 수정
        list.set(1, "orange"); // 두 번째 데이터 수정

        // 데이터 접근 및 출력
        System.out.println("첫 번째 데이터: " + list.get(0));
        System.out.println("두 번째 데이터: " + list.get(1));
        System.out.println("두 번째 데이터: " + list.get(2));
        System.out.println("마지막 데이터: " + list.get(list.size()-1));

        for (String str : list) {
            System.out.println(str);
        }


    }
}
