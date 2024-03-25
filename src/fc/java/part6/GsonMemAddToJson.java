package fc.java.part6;

import com.google.gson.Gson;
import fc.java.part6.model.Address;
import fc.java.part6.model.Person;

public class GsonMemAddToJson {
    public static void main(String[] args) {
        Address address = new Address("서울", "대한민국");
        Person member = new Person("홍길동", 30, "honggildong@example.com", address);

        //Person -> JSON
        Gson gson = new Gson();
        String json = gson.toJson(member);
        System.out.println(" Person 객체를 JSON으로 변환: " + json);

    }
}
