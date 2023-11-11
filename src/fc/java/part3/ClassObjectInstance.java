package fc.java.part3;

import fc.java.part3.model.StudentVO;

public class ClassObjectInstance {
    public static void main(String[] args) {
        StudentVO st1; // st1 : object(객체변수)
        StudentVO st2; // st2 : object(객체변수)
        StudentVO st3; // st3 : object(객체변수)

        st1 = new StudentVO("홍길동","컴공",33,"bit@empas.com",2023110,"010-1111-1111"); // st1 : instance(인스턴스 변수)
        st2 = new StudentVO("나길동","전기",43,"bit@empas.com",2023111,"010-1111-2222"); // st2 : instance(인스턴스 변수)
        st3 = new StudentVO("김길동","건축",25,"bit@empas.com",2023112,"010-1111-3333"); // st3 : instance(인스턴스 변수)

        System.out.println(st1.toString());
        System.out.println(st2);
        System.out.println(st3);
    }
}
