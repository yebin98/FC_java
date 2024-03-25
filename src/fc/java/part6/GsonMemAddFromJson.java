package fc.java.part6;

import com.google.gson.Gson;
import fc.java.part6.model.Person;

public class GsonMemAddFromJson {
    public static void main(String[] args) {
        String json = "{" +
                "\"name\": \"홍길동\"," +
                "\"age\": 30," +
                "\"email\": \"honggildong@example.com\"," +
                "\"address\": {" +
                "\"city\": \"서울\"," +
                "\"country\": \"대한민국\"" +
                "}" +
                "}";
        Gson gson = new Gson();

        //JSON -> Person
        Person member = gson.fromJson(json, Person.class);
        System.out.println("JSON을 Person 객체로 변환: " + member);
    }
}
