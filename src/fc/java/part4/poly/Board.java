package fc.java.part4.poly;

public class Board extends Object{ //toString() 생략
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override //재정의
    public String toString() {
//        super.toString();//상위 클래스의 메서드 호출
        System.out.println(super.toString());//상위 클래스의 메서드 호출 -> 번지 출력
        return "Board{" +
                "title='" + title + '\'' +
                '}';//문자열로 출력
    }
}
