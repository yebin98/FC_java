package fc.java.part6;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Key-Value 형태의 데이터를 관리하는 Map 객체 생성
        Map<String, Integer> studentScores = new HashMap<>(); //HashMap<String, Integer> studentScores 으로 해도 상관 없음
        // 데이터 추가 entrySet()
        studentScores.put("Kim", 95); // Entry<String, Integer>
        studentScores.put("Lee", 85);
        studentScores.put("Park", 90);
        studentScores.put("Choi", 80);
        // 데이터 조회
        System.out.println("Kim's score: " + studentScores.get("Kim"));
        System.out.println("Lee's score: " + studentScores.get("Lee"));
        // 데이터 수정
        studentScores.put("Park", 92);
        System.out.println("Park's score after update: " + studentScores.get("Park"));
        // 데이터 삭제
        studentScores.remove("Choi");
        System.out.println("Choi's score after removal: " + studentScores.get("Choi")); //null
        System.out.println("-------------------------------------------------");
        // 전체 데이터 출력
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + "'s score: " + entry.getValue());
        }

    }
}
