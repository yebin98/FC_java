package fc.java.part5;

import com.google.gson.Gson;
import fc.java.part5.model.Person;

public class GsonToAPI {
    public static void main(String[] args) {
        //Person 클래스를 정의하고, 이 클래스의 객체를 JSON 형식으로 변환하고 출력합니다.
        //Gson 객체를 생성한 후, toJson() 메서드를 사용하여 객체를 JSON 형식의 문자열로 변환합니다.
        Person person = new Person("John", 30);
        Gson gson = new Gson();
        String json= gson.toJson(person); // 객체를 JSON 형식으로 변환해주는 Gson API의 메서드
        System.out.println("json = " + json); //JSON
    }
}
