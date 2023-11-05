package fc.java.part2;

public class CallByReference {
    public static void main(String[] args) {
        float a = 56.7f;
        float b = 78.9f;
        //a+b = ?
        floatAdd(a,b);
//        add(a[]);
    }//끝 -> 종료

    // Q. 매개변수로 실수를 받아서 배열의 총합을 구하여 리턴 하는 메서드를 정의 하세요
    public static void floatAdd(float a, float b) {
        float sum=a+b;
        System.out.println("sum = " + sum);
//        return sum;
    }
}
