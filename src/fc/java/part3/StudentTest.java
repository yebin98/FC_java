package fc.java.part3;

import fc.java.part3.model.StudentVO;

public class StudentTest {
    public static void main(String[] args) {
        // Q. 정수 6개를 저장할 배열을 생성하세요
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 67;
        arr[3] = 98;
        arr[4] = 55;
        arr[5] = 32;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Q. 잘 설계된 학생(Student) 객체를 설계하고 데이터를 저장 한 후 출력하세요
        StudentVO vo = new StudentVO("홍길동", "컴퓨터공학과", 37, "bit@empas.com", 2023110, "010-1111-1111");
        System.out.println(vo.toString());

        //Q. 객체배열을 이용하여 4명의 학생(Student) 데이터를 저장하고 출력하세요
        StudentVO[] std=new StudentVO[4];

        //객체 생성
        std[0]=new StudentVO("홍길동","컴공",33,"bit@empas.com",2023110,"010-1111-1111");
        std[1]=new StudentVO("나길동","전기",43,"bit@empas.com",2023111,"010-1111-2222");
        std[2]=new StudentVO("김길동","건축",25,"bit@empas.com",2023112,"010-1111-3333");
        std[3]=new StudentVO("이길동","통신",51,"bit@empas.com",2023113,"010-1111-4444");

        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i].toString());
        }
        System.out.println();
        for (StudentVO st: std) {
            System.out.println(st.toString());
        }

    }
}
