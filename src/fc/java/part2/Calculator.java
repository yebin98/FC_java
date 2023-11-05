package fc.java.part2;
//클래스 단위로 프로그래밍 한다.
//시작, 메인 클래스
//javaSE 프로그램
public class Calculator {
    //main(){}메서드 : 동작, 처리
    public static void main(String[] args) {
        //두 개의 정수를 더하여 출력하는 자바 프로그램을 만들어 보자 -> Calculator 클래스
        //int a, b, sum; //선언
        //a = 1;
        //b = 1;
        //sum = a + b;
//      System.out.println(sum);//2
        FourArithmetic();
    }

    public static void FourArithmetic(){
        int a = 12;
        int b = 2;
        int plus = a + b;
        int minus = a - b;
        int c = a * b;
        int d = a / b;

        //출력 : sout
        System.out.println("a + b = " + plus);
        System.out.println("a - b = " + minus);
        System.out.println("a * b = " + c);
        System.out.println("a / b = " + d);

    }
}
