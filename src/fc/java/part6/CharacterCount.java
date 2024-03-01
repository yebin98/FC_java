package fc.java.part6;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello, World!";
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>(); //Map<Character, Integer> charCountMap도 가능 -> boxing sizing
        char[] strArray = str.toCharArray(); //{'H', 'e', 'l', 'l', '0', .....}
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println("Character Counts:");
        for (char c : charCountMap.keySet()) {
            System.out.println(c + ": " + charCountMap.get(c));
        }
    }
}
