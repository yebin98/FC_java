package fc.java.part2;

public class OverloadingTest {
    public static void main(String[] args) {
        float v =  add(35.6f, 56.7f); // 메서드 호출 -> 오버로딩 : 실행속도 떨어지는 원인? -> 정적 바인딩이여서 상관 없음
        System.out.println("v = " + v);
        
        int i = add(10, 50);
        System.out.println("i = " + i);
    }

    // Q. 매개변수로 두개의 정수 값을 받아서 / 총합을 구하여 / 리턴 하는 / [메서드를 정의] 하세요
    public static int add(int a, int b) {
        int sum=a+b;
        return sum;
    }

    // Q. 매개변수로 두개의 실수 값을 받아서 / 총합을 구하여 / 리턴 하는 / [메서드를 정의] 하세요
    public static float add(float a, float b) {
        float sum=a+b;
        return sum;
    }
}
