package fc.java.part6;

import fc.java.part6.model.Converter;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        //stringToInt참조 -> 정적메소드 참조
        Converter<String, Integer> converter = IntegerUtils::stringToInt;
        Integer result = converter.convert("123");// "auto unboxing
        System.out.println("result = " + result);//123
    }
}
