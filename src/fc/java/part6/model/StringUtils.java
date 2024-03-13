package fc.java.part6.model;

public class StringUtils {
    //인스턴스 메서드
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
