package fc.java.part3;

import fc.java.part3.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVO객체에 원하는 이름, 나이, 전화번호를 저장하고 출력하세요
        PersonVO vo = new PersonVO(); //기본생성자
        PersonVO vo1 = new PersonVO("iyb", 26, "010-1111-2222");
        PersonVO vo2 = new PersonVO("lyb", 32, "010-3333-8888");

        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone() + "\t");
        System.out.println(vo1.getName() + "\t" + vo1.getAge() + "\t" + vo1.getPhone() + "\t");
        System.out.println(vo2.getName() + "\t" + vo2.getAge() + "\t" + vo2.getPhone() + "\t");
    }
}
