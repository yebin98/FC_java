package fc.java.part2;

public class CarTest {
    public static void main(String[] args) {
        // 자동차의 정보를 저장 하려고 한다 변수를 만들어 보시요
        String model = "BMW528i"; //변수 초기화 문자열 : 따옴표
        System.out.println("model = " + model);
        long distance = 10000000000L; //숫자 작성시 기본적으로 int(4byte)로 인식함. long(8byte) 선언 시 숫자 뒤에 L을 붙여줘야 함.
        System.out.println("distance = " + distance + "km");
        int price = 900000;
        System.out.println("price = " + price);
        String company="BMW";
        System.out.println("company = " + company);
        char type='A';
        System.out.println("type = " + type + "Type");
        boolean auto = true;//문자 : 홑따옴표
        System.out.println("auto = " + auto);
        int year = 2000;
        System.out.println("year = " + year);
        float gasmi = 12.5f;//정수 작성시 기본적으로 double(8byte)로 인식함. float(4byte) 선언 시 숫자 뒤에 f를 붙여줘야 함.
        System.out.println("gasmi = " + gasmi +"L");

    }
}
