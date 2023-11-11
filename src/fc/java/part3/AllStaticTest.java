package fc.java.part3;

import fc.java.part3.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
//        AllStatic st=new AllStatic();
//        System.out.println(st.hap(10,20));
//        System.out.println(st.max(10,20));
//        System.out.println(st.min(10,20));

        // 바람직한 방법
        System.out.println(AllStatic.hap(10,20));
        System.out.println(AllStatic.max(10,20));
        System.out.println(AllStatic.min(10,20));

//        System sys = new System(); //System는 private 생성자이다.
//        Math math = new Math();//Math는 private 생성자이다.
    }
}
