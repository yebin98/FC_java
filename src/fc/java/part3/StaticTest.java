package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // a + b = ?
        int sum= StaticTest.hap(a,b); //StaticTest :  같은 static zoon에 있으므로 생략가능 -> 일반적으론 static메서드는 클래스 이름으로 접근한다.
        System.out.println(sum);
    }
    // Q. 매개변수로 2개의 정수를 입력받아서 / 총합을 구하여 / 리턴하는 / [메서드를 정의]하시오
    public static int hap(int a, int b){
        int v=a+b;
        return v;
    }
}
