package fc.java.part4;

import fc.java.part4.poly.*;

public class ObjectPolyArg {
    public static void main(String[] args) {
        //Upcasting
        A a=new A();
        display(a);
        B b=new B();
        display(b);
    }

//    private static void display(A a) {
//        a.printGo();
//    }
//
//    private static void display(B b) {
//        b.printGo();
//    }

    public static void display(Object obj){//다형성 인수
        if(obj instanceof A){
            ((A)obj).printGo(); //Downcasting
        }else{
            ((B)obj).printGo(); //Downcasting
        }
    }
}
