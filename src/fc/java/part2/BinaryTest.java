package fc.java.part2;

public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        float f = 35.6f; //float 사용 시 값 뒤에 f를 안 붙이면 선언은 4bit이지만 값은 자바의 실수 기본값인 double을 사용하여 8bit가 되어 에러가 발생 됨.
        boolean b = false;
        char c = 'a';
        String s = "apple";

        //Q. 69를 10진수, 2진수,8진수,16진수로 출력하시요.
        int decimal = 69;
        System.out.println("decimal = " + decimal);
        int binary = 0b01000101;//2진수
        System.out.println("binary = " + binary);
        int octal = 0105;//8진수
        System.out.println("octal = " + octal);
        int hexa = 0x45;
        System.out.println("hexa = " + hexa);

        //Q. 123을 10진수, 2진수,8진수,16진수로 출력하시요.
        int decimal1 = 123;
        System.out.println("decimal1 = " + decimal1);
        String binary1 = Integer.toBinaryString(decimal1);//2진수 0b01111011
        System.out.println("binary1 = " + binary1);
        String octal1 = Integer.toOctalString(decimal1);//8진수 0173
        System.out.println("octal1 = " + octal1);
        String hexa1 = Integer.toHexString(decimal1);//16진수 0x7B : 대소문자 상관 없음
        System.out.println("hexa1 = " + hexa1);
    }
}
