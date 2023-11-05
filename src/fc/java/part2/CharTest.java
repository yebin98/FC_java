package fc.java.part2;

public class CharTest {
    public static void main(String[] args) {
        //Q. 아스키코드 표를 참고하여 문자를 핸들링 해보자
        char c = 'A';
        System.out.println("c = " + c);//'A'
        int a = 'A';//수치형 자료로 변환됨 -> 아스키코드 값이 출력 됨
        System.out.println("a = " + a);
        int b = 'B' + 1;//67
        System.out.println("b = " + (char)b);//형변환(casting) 67->C

        //Q. ‘가’라는 한글 한 문자를 변수에 저장하고 출력하시요.
        char han = '가';
        System.out.println("han = " + han);
        int hanD = '가';
        System.out.println("hanD = " + hanD);
        int hanU = '\uAC00'; // 역슬래시u : 한글
        System.out.println("hanU = " + (char)hanU);
        
        //Q. 대문자 ‘A’를 문자 ‘a’로 변환하여 출력하시요.(ASCII코드 참고)
        char upper = 'A';
        char lower = (char)(upper + 32);
        System.out.println("lower = " + lower);

        char lower1 = 'u';
        int upper1 = lower1 - 32;
        System.out.println("upper1 = " + (char)upper1);

        char upper2 = (char)(lower1 - 32);
        System.out.println("upper1 = " + upper2);

        //Q. ‘1’+’2’=3이 나오도록 프로그래밍 하시요.
        int data = '1' + '2';
        System.out.println("data = " + data);

        char i = '1';//49-48 = 1
        char j = '2';//50-48 = 2
//        int sum = (i - 48)+(j-48);
        int sum = (i - '0')+(j - '0');
        System.out.println("sum = " + sum);

        //Q. ‘1’+’2’+’3’+’4’+’5’=15이 나오도록 프로그래밍 하시요.
        int sum1 = 0; //'0' -> 48
        sum1 = sum1 + ('1' - '0');//'1' -> 49 - 48 = 1
        sum1 = sum1 + ('2' - '0');
        sum1 = sum1 + ('3' - '0');
        sum1 = sum1 + ('4' - '0');
        sum1 = sum1 + ('5' - '0');
        System.out.println("sum1 = " + sum1);//println : 개헹, 줄바꿈 //255

    }
}
