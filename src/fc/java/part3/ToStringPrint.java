package fc.java.part3;

import fc.java.part3.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVO객체에 원하는 이름, 나이, 전화번호를 저장하고 toString() 메서드로 출력하세요
        PersonVO vo = new PersonVO("iyb", 26, "010-1111-2222");
        System.out.println(vo.toString());
        System.out.println(vo); //toStrig 생략 시 컴파일러에서 toString을 찾음
    }
}
