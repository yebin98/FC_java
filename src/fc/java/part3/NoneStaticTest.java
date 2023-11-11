package fc.java.part3;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // a + b = ?
        NoneStaticTest st=new NoneStaticTest();// 객체 생성 -> main은 생성을 안해도 되지만 아래 none-static이 있기때문에 생성함
        int sum= st.hap(a,b);
        System.out.println(sum);
    }
    // Q. 매개변수로 2개의 정수를 입력받아서 / 총합을 구하여 / 리턴하는 / [메서드를 정의]하시오
    public int hap(int a, int b){
        int v=a+b;
        return v;
    }
}
