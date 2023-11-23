package fc.java.part5.model;
//interface는 자바에서 제공을한다.
public interface Connection {
    //데이터베이스 연결동작
    public void getConnection(String url, String username, String password);
}
