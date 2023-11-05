package fc.java.part2;

public class MethodMakeTest {
    public static void main(String[] args) {
//        2개의 정수를 더해서 결과값을 출력한다.
        int x = 3;
        int b = 5;
//        int sum = a + b;
//        System.out.println("sum = " + sum);
        //add라는 메서드를 호출(call)하여 두수의 합의 결과를 출력
         int result = add(x,b);
        System.out.println("result = " + result);
    }
    // Q. [매개변수로 2개의 정수를 받아서] [총합을 구하여] [리턴] 하는 [메서드를 정의]하세요
    // 메서드는 독립적임
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}
