package fc.java.part4.poly;

//추상클래스 = 추상메서드 + 구현메서드
public interface RemoCon {
    public int MAXCH=99;
    //public static final int MAXCH=99; //같은 표현 static final생략 가능 //MAXCH : 상수(못바꾸는 값) -> 대문자로 작성
    public int MINCH=1;
    //public final static int MINCH=1; // 같은 표현 final static 위치 변경 가능 //MINCH : 상수(못바꾸는 값) -> 대문자로 작성

    public void chUp(); //abstract 생략 가능(묵시적 추상 메서드가 됨)
    public void chDown(); //abstract 생략 가능(묵시적 추상 메서드가 됨)
    public void volUp(); //abstract 생략 가능(묵시적 추상 메서드가 됨)
    public void volDown(); //abstract 생략 가능(묵시적 추상 메서드가 됨)
    public void internet(); //abstract 생략 가능(묵시적 추상 메서드가 됨)

    //TV에 단독으로만 사용하는 기능
    //구현메서드 쓸 수 없음
//    public void internet(){
//        System.out.println("인터넷이 구동된다.");
//    };
}
