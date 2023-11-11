package fc.java.part3.model;

public class AllStatic {
    // 인위적으로 생성자를 private함 -> 접근을 하기 위해 해당 클래스가 가지로 있는 모든 멤버는 static 이어야 함
    private AllStatic(){}
    public static int hap(int a, int b){
        int v=a+b;
        return v;
    }
    public static int max(int a, int b){
        return a>b ? a : b;
    }
    public static int min(int a, int b){
        return a<b ? a : b;
    }
}
