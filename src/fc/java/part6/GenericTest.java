package fc.java.part6;

import fc.java.part5.model.Book;
import fc.java.part6.model.Movie;
import fc.java.part6.model.ObjectArray;

public class GenericTest {
    public static void main(String[] args) {
        /*ObjectArray<String> array = new ObjectArray<>(5);
        array.set(0, "Hello");
        array.set(1, "World");
        array.set(2, "Java");
        array.set(3, "Generic");
        array.set(4, "Example");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }*/

        ObjectArray<Book> bList = new ObjectArray<>(5);
        bList.set(0, new Book("자바",15000, "한빛", "홍길동"));
        bList.set(1, new Book("C++",17000, "대림", "이길동"));
        bList.set(2, new Book("Python",16000, "정보", "나길동"));

        for (int i = 0; i < bList.size(); i++) {
            System.out.println(bList.get(i));
        }
    }
}
