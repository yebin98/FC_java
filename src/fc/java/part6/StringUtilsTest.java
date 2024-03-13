package fc.java.part6;

import fc.java.part6.model.Converter;
import fc.java.part6.model.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils(); //객체 생성
        //인스턴스 메서드 참조
        Converter<String, String> converter = stringUtils::reverse;
        String result = converter.convert("hello");
        System.out.println(result); // 출력: olleh
    }




}
