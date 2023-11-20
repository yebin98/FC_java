package fc.java.part5;

import fc.java.part5.model.Book;

import java.util.*;

public class ArrayListBestTest {
    public static void main(String[] args) {
        //Book 3권을 배열에 저장하고 출력하세요
        //Book[], Object[]
        //ArrayList == ObjectArray
//        ArrayList list = new ArrayList<>();//기본크기(10) : Object
        List<Book> list = new ArrayList<Book>();//기본크기(10) : Object[] -> Book[] => 재네릭을 사용하여서 다운케스팅을 할 필요가 없어짐
        list.add(new Book("자바",15000, "한빛", "홍길동")); //객체 생성 -> add(배열에 넣음)
        list.add(new Book("C++",17000, "대림", "이길동"));
        list.add(new Book("Python",16000, "정보", "나길동"));

        Book vo = list.get(0);//Book <--- Book
        System.out.println(vo.toString());

        vo = list.get(1);//Book <--- Book
        System.out.println(vo.toString());

        vo = list.get(2);//Book <--- Book
        System.out.println(vo.toString());

        for (int i = 0; i < list.size(); i++) {
            //동적바인딩 다형성에서 부모가 자식애 있는 메소드를 접근할 때 부모가 가지고 있는 메서드가 자식에 재정의 되어있으면 부모의 메서드를 호출하는 것이 아니라 재정의된 메서드가 호출됨
            System.out.println(list.get(i)); //Object -> Book(JVM에서 자동으로 Book의 toString을 호출해줌)

        }
    }
}
