package fc.java.part6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Doe");
        // String 클래스의 compareTo 메서드를 참조
        Collections.sort(names, String::compareTo);
        System.out.println(names); // 출력: [Doe, Jane, John]

        for (String name: names) {
            System.out.println("name = " + name);
        }

    }
}
