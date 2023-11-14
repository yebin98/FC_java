package fc.java.part4.poly;

public class Radio implements RemoCon{
    @Override
    public void chUp() {
        System.out.println("Radio 체널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("Radio 체널이 내려간다.");
    }

    @Override
    public void volUp() {
        System.out.println("Radio 볼륨이 올라간다.");
    }

    @Override
    public void volDown() {
        System.out.println("Radio 볼륨이 내려간다.");
    }

    @Override
    public void internet() {
        System.out.println("Radio에서는 인터넷이 실행되지 않는다.");
    }
    //chUp(); chDown(); volUp(); volDown();
}
