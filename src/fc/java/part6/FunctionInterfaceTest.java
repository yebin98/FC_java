package fc.java.part6;

import fc.java.part6.model.MathOperation;

public class FunctionInterfaceTest implements MathOperation {
    public static void main(String[] args) {
        MathOperation mo = new FunctionInterfaceTest();
        int result = mo.operation(10, 20);
        System.out.println("10 + 20 = " + result);
    }

    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
