package fc.java.part2;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x = 10;
        if(x >= 0){
            System.out.println("0 or 양수");
        } else{
            System.out.println("음수");
        }

        // Q. 정수 1개를 입력 받아 짝수인지 홀수 인지를 판단하는 프로그램을 만드세요.
        Scanner scan = new Scanner(System.in); //클래스 변수명 = 객체 생성 생성자(메소드)
        System.out.print("정수를 입력하세요. : ");
        int num = scan.nextInt();
        if(num % 2 == 0){
            System.out.println("짝수입니다.");
        } else{
            System.out.println("홀수입니다.");
        }

        //Q. 입력 받은 수가 12의 배수인지를 출력하는 코드를 작성하세요.
        System.out.print("정수를 입력하세요. : ");
        int su = scan.nextInt();
        if(su % 12 == 0){
            System.out.println("12의 배수입니다.");
        } else{
            System.out.println("12의 배수가 아닙니다.");
        }

        //Q. 년도를 입력 받아서 해당 년도가 윤년인지 아닌지를 판단하여 출력하는 코드를 작성하세요.
        //윤년 : 2월29일이 존재하는 연도. 4의 배수 이면서 100의 배수가 아닌 해 이거나 400의 배수인 해
        System.out.print("년도를 입력하세요. : ");
        int year = scan.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ){
            System.out.println("윤년입니다.");
        } else{
            System.out.println("윤년이 아닙니다.");
        }

    }
}
