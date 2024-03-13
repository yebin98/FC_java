package fc.java.part6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {

    public static boolean isEven(int number){
        return number%2 == 0;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 자바에서 제공된 함수형 인터페이스를 사용한 짝수 여부 판별
        Predicate<Integer> isEven = n -> n % 2 == 0;
        // 스트림 API를 사용해 짝수만 필터링, 정렬, 제곱하고, 합계를 계산
        int sumOfSquares = numbers.stream()
//                .filter(isEven) // n -> n % 2 == 0 람다식을 직접 작성해도 상관 없음 // isEven.test(?) => test에 뭘 할지 모르기 때문에 .test 안적음
                .filter(StreamExample :: isEven) //참조 방식
                .sorted()
                .map(n -> n * n) //람다식
                .reduce(0, Integer::sum);
        System.out.println("짝수의 제곱의 합: " + sumOfSquares);//220
    }
}
