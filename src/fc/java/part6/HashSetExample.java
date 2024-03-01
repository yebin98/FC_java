package fc.java.part6;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 객체 생성
        Set<String> set = new HashSet<>();
        // 요소 추가
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // 중복된 요소는 추가되지 않음

        // 요소 개수 출력
        System.out.println("Set size: " + set.size());

        // 모든 요소 출력
        for (String element : set) {
            System.out.println(element);
        }

        // 요소 삭제
        set.remove("Banana");

        // 요소 출력
        System.out.println("---------------------------");
        for (String element : set) {
            System.out.println(element);
        }

        // 요소 포함 여부 확인
        boolean contains = set.contains("Cherry");
        System.out.println("Set contains Cherry? " + contains); //true

        // Set 비우기
        set.clear();

        // 비어있는 Set 확인
        boolean empty = set.isEmpty();
        System.out.println("Set is empty? " + empty); //true
    }
}
