package fc.java.part5;

import fc.java.part5.model.A;
import fc.java.part5.model.B;
import fc.java.part5.model.C;
import fc.java.part5.model.ObjectArray;

public class MyObjectArrayTest {
    public static void main(String[] args){
        //A, B, C 객체를 배열(Object[])에 저장하고 출력하세요.
        //Book, Movie, Member...
        ObjectArray list = new ObjectArray(10);
        list.add(new A()); //Upcasting Object element = new A();
        list.add(new B()); //Upcasting Object element = new B();
        list.add(new C()); //Upcasting Object element = new C();

        A a=(A)list.get(0); //Downcasting A<=Object
        a.display(); // 나는 A이다.

        B b=(B)list.get(1); //Downcasting B<=Object
        b.display(); // 나는 B이다.

        C c=(C)list.get(2); //Downcasting C<=Object
        c.display(); // 나는 C이다.

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof A){
                ((A)list.get(i)).display();
            } else if (list.get(i) instanceof B) {
                ((B)list.get(i)).display();
            }else {
                ((C)list.get(i)).display();
            }
        }
    }
}
