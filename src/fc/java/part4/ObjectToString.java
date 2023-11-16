package fc.java.part4;

import fc.java.part4.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b=new Board();
        b.setTitle("게시글입니다.");
        System.out.println(b.getTitle());
        System.out.println(b.toString()); //b.toString() 번지 출력 -> 클래스에 toString을 재정의하면 정보의 문자열이 출력된다.
        System.out.println(b);

    }
}
