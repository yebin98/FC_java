package fc.java.part3.model;

public class MemberDTO {
    public String name;
    private int age; //정보 은닉
    public String phone;
    public String email;
    public String addr;
    public float weight;

    public void play(){//메서드는 public으로 함 -> 상호작용을 해야하기 때문에
        System.out.println("운동");
    }

}
