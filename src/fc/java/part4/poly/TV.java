package fc.java.part4.poly;

public class TV implements RemoCon{
    //chUp(); chDown(); volUp(); volDown();

    @Override
    public void chUp() {
        System.out.println("TV 체널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("TV 체널이 내려간다.");
    }

    @Override
    public void volUp() {
        System.out.println("TV 볼륨이 올라간다.");
    }

    @Override
    public void volDown() {
        System.out.println("TV 볼륨이 내려간다.");
    }
    @Override
    public void internet() {
        System.out.println("TV에서는 인터넷이 실행된다.");
    }
    
    
}
