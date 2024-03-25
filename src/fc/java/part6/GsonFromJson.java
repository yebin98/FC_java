package fc.java.part6;

import com.google.gson.Gson;
import fc.java.part6.model.Member;

public class GsonFromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"hong@example.com\"}"; // \ : "" 구분 기호
        //JSON -> Object(Member)
        Gson gson = new Gson();
        Member mvo = gson.fromJson(json, Member.class);

        System.out.println("mvo = " + mvo);//mvo.toString()
        
    }
}
