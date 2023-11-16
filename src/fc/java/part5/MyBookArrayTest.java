package fc.java.part5;

import fc.java.part5.model.Book;
import fc.java.part5.model.BookArray;

public class MyBookArrayTest {
    public static void main(String[] args){
        //Q. 책 3권을 배열에 저장하고 출력하세요 -> Book[]
        BookArray list = new BookArray();//책 배열, 길이 : 5 객체 생성
        list.add(new Book("자바",15000, "한빛", "홍길동")); //객체 생성 -> add(배열에 넣음)
        list.add(new Book("C++",17000, "대림", "이길동"));
        list.add(new Book("Python",16000, "정보", "나길동"));

        Book vo = list.get(0);
        System.out.println(vo); // toString -> 자바|15000|한빛|홍길동
        vo = list.get(1);
        System.out.println(vo); // toString -> C++|17000|대림|이길동
        vo = list.get(2);
        System.out.println(vo); // toString -> Python|16000|정보|나길동

        System.out.println();
        System.out.println(list.size()); // 3

        System.out.println();
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i)); // 3
        }
    }
}
