package fc.java.part2;

public class VDATest {
    public static void main(String[] args) {
        //Q. 정수 한 개를 저장하기 위해서 변수를 선언 하시요.
        int a; //변수선언 -> 기억공간 만들어 짐
        
        //Q. 변수 a에 10을 저장하고 a에 저장된 값을 변수 b에 저장하고 변수 b에 10을 곱하여 변수 c에 저장하시요
        a = 10; //대입, 할당
        System.out.println("a = " + a);
        int b = a;
        int c = b*10;
        System.out.println("c = " + c);
        
        //Q. sum이라는 변수에 1부터 5까지의 수를 누적(accumulate)해서 출력 하시요.
        int sum = 0;//변수 초기화, 지역변수(블록 안에서 만들어진 변수)
        for(int i = 1; i<6; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
        
        //Q. x=10, y=20을 저장하고 변수의 값을 서로 교환(swap)하여 출력하시요.
        int x = 10; //변수 초기화, 지역변수
        int y = 20; //변수 초기화, 지역변수
        System.out.println("x = " + x + " y = " + y);
        //교환(swap)
        int tmp; //임시 기억공간
        tmp = y;
        y = x;
        x = tmp;
        System.out.println("x = " + x + " y = " + y);
    }
}
