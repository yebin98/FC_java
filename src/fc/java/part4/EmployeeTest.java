package fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        // [일반 사원] 한명의 객체를 생성하고 데이터를 저장 후 출력하세요
//        RempVO vo = new RempVO();
//        vo.name="홍길동";
//        vo.age=33;
//        vo.phone="010-1111-1111";
//        vo.empDate="2010.01.01";
//        vo.dept="홍보부";
//        vo.marriage=true;

        RempVO vo = new RempVO("홍길동", 33, "010-1111-1111","2022-11-10", "기획부", false);

        //출력
//        System.out.println(vo.name+"\t"+vo.age+"\t"+vo.phone+"\t"+vo.empDate+"\t"+vo.dept+"\t"+vo.marriage+"\t");
        System.out.println(vo.toString());
    }
}
