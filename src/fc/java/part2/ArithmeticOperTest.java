package fc.java.part2;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        // Q. 나누기와 나머지 연산자의 활용(정수의 자릿수 구하기)
//        ✓ 백의 자릿수 계산 과정
//        - 3625 / 100 -> 36 (백미만 자릿수 제거)
//        - 36 % 10 -> 6 (일의 자릿수 추출)
        int digit = 3628;
        System.out.println(digit%10);// 8
        System.out.println(3625 / 10 % 10);// 2
        System.out.println(3625 / 100 % 10);// 6
        System.out.println(3625 / 1000 % 10);// 3

        int num = 2579;
        //짝수/2 = (0), 홀수/2 = (1) / 배수
        int su = 5;
        if (su%2==0){
            System.out.println("짝수 입니다.");
        }else {
            System.out.println("홀수 입니다.");
        }

    }
}
