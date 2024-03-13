package fc.java.part6;

import fc.java.part6.model.MathOperation;
import fc.java.part6.model.MathOperationImpl;

public class FunctionInterfaceTest1 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperationImpl();
        int result = mo.operation(10, 20);
        System.out.println("result = " + result);
    }
}
