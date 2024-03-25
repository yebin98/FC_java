package fc.java.part6;

import com.google.gson.Gson;
import fc.java.part6.model.Member;

public class GsonToJson {
    public static void main(String[] args) {
        Member mvo = new Member("홍길동", 30, "hong@example.com");
        //JSON -> {"name":"홍길동","age":30,"email":"hong@example.com"}
        //객체 생성
        Gson gson = new Gson();
        //Object(member) -> JSON
        String json = gson.toJson(mvo);

        System.out.println("json = " + json);
    }
}
