package fc.java.part5.model;
//OracleDriver는 Oracle회사에서 만들어서 제공하면 된다.(Driver)
public class OracleDriver implements Connection{

    @Override
    public void getConnection(String url, String username, String password) {
        //실제적으로 구현이 되어있다.
        System.out.println("url, username, password 정보를 이용하여 oracle DB접속을 시도한다.");
    }
}
