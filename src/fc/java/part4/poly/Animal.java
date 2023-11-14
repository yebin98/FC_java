package fc.java.part4.poly;

//추상클래스(불완전한 클래스) -> 단독 사용 불가능(객체 생성 불가능)
public abstract class Animal {
    //추상메서드-> 재정의 필수
    public abstract void eat();// 추상메서드(불완전한 메서드) : 메서드의 구현부가 없다.

    //구현메서드 -> 재정의 선택
    public void move(){
        System.out.println("무리를 지어 이동한다.");
    }

}
