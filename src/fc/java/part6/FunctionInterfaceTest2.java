package fc.java.part6;


import fc.java.part6.model.MathOperation;
//  이 코드가 중요함
public class FunctionInterfaceTest2 {
    public static void main(String[] args) {
//        MathOperation mo = new MathOperation(); //구현체가 없기 때문에 에러남
        //MathOperation 인터페이스를 [익명내부클래스]로 구현
        MathOperation mo = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
        int result = mo.operation(10, 20);
        System.out.println(result);
    }
}
