package fc.java.part6;

import fc.java.part5.model.Book;

import java.util.*;

public class ArrayListGeneric {
    public static void main(String[] args) {
        List list = new ArrayList(); // Object[] -> 타입의 안전성 보장 안됨 => 데이터 처리 힘듦
        list.add(new Book("자바",15000, "한빛", "홍길동"));
        list.add("Hello");

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        List<Book> book = new ArrayList<>();//Book[]
        book.add(new Book("자바",15000, "한빛", "홍길동"));
//      book.add("Hello");// 에러남
        book.add(new Book("C++",17000, "대림", "이길동"));

        System.out.println(book.get(0));
        System.out.println(book.get(1));
    }
}
