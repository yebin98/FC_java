package fc.java.part6;

import fc.java.part6.model.MathOperation;

public class LambdaExample {
    public static void main(String[] args) {
        //람다식을 사용하여 메서드를 구현
        // 코드를 간결, 확장, 구현하기 쉽다.
//        MathOperation add = (int x, int y) -> { return x + y; };
        MathOperation add = (x, y) -> x + y; //간결한 람다식 표현
        MathOperation multi = (x, y) -> x * y;

        // add 메서드를 사용하여 10과 20을 더하기
        int result = add.operation(10, 20);
        System.out.println("10 + 20 = " + result);

        int multiresult = multi.operation(10, 20);
        System.out.println("10 * 20 = " + multiresult);

    }
}
