package fc.java.part2;

public class GuGuDan {
    public static void main(String[] args) {
        // Q. 이중 반복문을 이용하여 아래와 같은 구구단(9X9) 을 출력하세요.
        for (int i = 2; i <= 9 ; i++) {
            System.out.print(i + "단 \t\t" );
        }
        System.out.println();//줄바꿈
        for(int i=1 ; i < 10 ; i++ ) {
            for(int j=2 ; j < 10 ; j++ ) {
                System.out.print(j + " x " + i + " = " + i*j + "\t");
            }
            System.out.println();//줄바꿈
        }



    }
}
