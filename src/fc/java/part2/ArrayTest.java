package fc.java.part2;

public class ArrayTest {
    public static void main(String[] args) {
        //Q. 실수 5개를 저장 할 [배열을 생성]하고 모든 원소에 10.5을 저장하고 출력하세요.
        float[] f = new float[5];

        for(int i = 0; i<f.length; i++){
            f[i] = 10.5f;
            System.out.println("f[" + i + "]= " + f[i]);
        }

        // Q. 정수 5개를 아래처럼 배열에 초기화 하고 index 0번째와 index 3번째 값을 더하여 출력하세요.
        int[] a = {10, 20, 30, 40, 50}; //초기화

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i] = " + a[i]);
        }
        int sum = a[0] + a[3];
        System.out.println("sum = " + sum);
        System.out.println(a.length);

        int[] b = new int[3];
        for(int i = 0; i<b.length; i++){
            System.out.println("b[" + i + "]= " + b[i]);//0
        }

        float[] e = new float[3];
        for(int i = 0; i<e.length; i++){
            System.out.println("e[" + i + "]= " + e[i]);//0.0
        }
        
    }
}
