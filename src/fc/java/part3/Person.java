package fc.java.part3;
//객체(object) = 상태정보(맴버변수) + 행위정보(멤버메서드)
//Person 객체를 생성
public class Person {
    public String name;
    public int age;
    public String phone;

    //기본생성자메서드
    public Person(){
        //자동생성
    } // 생략 가능

    public void play(){
        System.out.println("운동을 한다.");
    }
    public void eat(){
        System.out.println("음식을 먹다.");
    }
    public void walk(){
        System.out.println("걷다.");
    }


}
