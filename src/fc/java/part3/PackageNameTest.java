package fc.java.part3;

//import java.lang.*; // default package
import fc.java.part3.model.*;

import java.util.Scanner;

public class PackageNameTest {
    public static void main(String[] args) {
        // Q. 지금까지 자바에서 제공해주어서 사용해본 클래스들의 이름을 적어보자
        String str = "홍길동";
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello world");

        // Q. 우리가 직접 만들어서 사용해 본 클래스들의 이름을 적어보자
        CarVO car = new CarVO();
        CarDAO dao = new CarDAO();
    }

}
