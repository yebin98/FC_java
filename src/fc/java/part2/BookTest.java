package fc.java.part2;

public class BookTest {
    public static void main(String[] args) {
        //Q. 정수 한 개를 저장할 [변수를 선언]하시오.
        int a;
        a = 10;
        System.out.println("a = " + a);
        
        //Q. 한 권의 책 데이터를 저장하고 출력하시요. 6개의 변수로
//        String title = "자바";
//        int price = 30000;
//        String company = "패스트캠퍼스";
//        String author = "박메일";
//        int page = 700;
//        String isbn = "ISBN - 11990011";
//
//        System.out.println(title + "\t" + price + "\t" + company + "\t" + author + "\t" + page + "\t" + isbn + "\t");

        //Q. 책 한 권를 저장할 [변수를 선언]하시오.
        Book b = new Book();
//        b.title = "자바";
//        b.price = 30000;
        System.out.println("b = " + b);
        
    }
    //Q. 6개의 변수를 하나의 구조에 담기 위해서 Book이라는 바구니(이동)를 만들어보자.
//    public static class Book{
//        public String title;
//        public int price;
//        public String company;
//        public String author;
//        public int page;
//        public String isbn;
//    }
}
