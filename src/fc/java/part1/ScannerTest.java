package fc.java.part1;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        // java.util.Scanner scan=new java.util.Scanner(System.in);
        Scanner scan=new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt(); //정수입력, 블럭상태(프로그램이 멈춰있는 상태)
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요 : ");
        float f = scan.nextFloat() ; // 실수입력
        System.out.println("f = " + f);
        
//        double d = scan.nextDouble() ; // 실수입력
        
        System.out.print("문자열을 입력하세요 : ");//"A", "ABC"
        String str = scan.next() ; //문자열입력(공백 앞까지 입력 받음)
        // "Hello World" 입력 시 공백 앞까지 입력 받기 때문에 Hello가 출력되고 World가 스트림 안에 남는다. 그래서 다음 scan.nextLine()때 출력 됨
        System.out.println("str = " + str);

        scan.nextLine(); // 버퍼비우기(스트림 비우기) //실행해서 실제로는 World 출력 됨 -> World 지우기

        System.out.print("문자열을 입력하세요 : ");//"A", "ABC"
        String strL = scan.nextLine(); //문자열입력(엔터까지 입력 받음)
        System.out.println("strL = " + strL);

        scan.close();

    }
}
