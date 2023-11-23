package fc.java.part5;

//import java.lang * 이 생략되어 있음
public class HelloWorldString {
    public static void main(String[] args) {
        String str1=new String("HelloWorld"); // Heap
        String str2="HelloWorld"; // Literal Pool
        System.out.println(str1.toString());
        System.out.println(str2.toString());
    }
}
