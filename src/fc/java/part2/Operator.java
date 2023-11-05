package fc.java.part2;

public class Operator {
    public static void main(String[] args) {
        //두 과목의 점수를 이용하여 총점과 평균을 출력하는 JavaSE프로그램을 만들어보자.
        int kor, eng, total; //int 자료형 변수 선언 -> 기억공간이 만들어짐.
        kor = 77;
        eng = 87;
        total = kor+eng; //총점
        //avg = (kor+eng)/2;
        System.out.println("총점 : "+ total);
        System.out.println("평균 : "+ total/2);
    }
}
