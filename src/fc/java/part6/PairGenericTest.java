package fc.java.part6;

import fc.java.part6.model.Pair;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("hello", 1); // Integer Auto-boxing
        System.out.println("key: " + pair.getKey()); //hello
        System.out.println("value: " + pair.getValue()); //1

        //HashMap : 검색을 빠르게 할 수 있는 자료구조(HashMap, Hashtable)
        Map<String, Integer> maps = new HashMap<>();
        maps.put("kor", 60);
        maps.put("eng", 80);
        maps.put("math", 70);

        System.out.println(maps.get("kor"));
        System.out.println(maps.get("eng"));
        System.out.println(maps.get("math"));
    }
}
