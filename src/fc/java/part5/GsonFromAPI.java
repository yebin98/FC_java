package fc.java.part5;

import com.google.gson.Gson;
import fc.java.part5.model.Person;

public class GsonFromAPI {
    public static void main(String[] args) {
        //위 예제에서는 JSON 형식의 문자열을 자바 객체로 변환하고,객체의 필드 값을 출력합니다.
        //Gson 객체를 생성한 후, fromJson() 메서드를 사용하여 JSON 문자열을 자바 객체로 변환합니다.
        //변환할 클래스의 타입을 인자로 전달합니다.
        String json = "{\"name\":\"John\",\"age\":30}"; // \ 문자열의 기호와 다르게 구분하기 위해
        Gson gson = new Gson();
        Person person = gson.fromJson(json, Person.class); //JSON 형식의 문자열을 자바 객체로 변환해주는 Gson API의 메서드
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.toString());
    }

}
