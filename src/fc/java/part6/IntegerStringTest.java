package fc.java.part6;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";

        System.out.println(str1 + str2); // "123" + "123" = "123123" => +(결합)
        //"123" + "123" = 246(정수)
        int num = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println(num);

        int su1 = 123;
        int su2 = 123;
        //su1 + su2 = "123123"
        System.out.println(su1 + su2); // 123 + 123 = 246 => +(덧셈)
        String str = String.valueOf(su1) + String.valueOf(su2);
        System.out.println(str);//"123123"
        String s = su1+""+su2;
        System.out.println(s);
    }
}
