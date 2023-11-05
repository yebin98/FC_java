package fc.java.part2;

public class AssignOperTest {
    public static void main(String[] args) {
        //1식 증가하는 수식을 써보세요
        int a = 1;
        a++;
        System.out.println("a1 = " + a);
        ++a;
        System.out.println("a2 = " + a);
        a=a+1;
        System.out.println("a3 = " + a);
        a+=1;
        System.out.println("a4 = " + a);

        System.out.println();
        //1식 감소하는 수식을 써보세요
        int b = 7;
        b--;
        System.out.println("b1 = " + b);
        --b;
        System.out.println("b2 = " + b);
        b=b-1;
        System.out.println("b3 = " + b);
        b-=1;
        System.out.println("b4 = " + b);
    }
}
