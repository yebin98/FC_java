package fc.java.part5;

import fc.java.part5.model.Connection;
import fc.java.part5.model.MSSQLDriver;
import fc.java.part5.model.MySQLDriver;
import fc.java.part5.model.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        //oracle DB 접속
        Connection conn = new OracleDriver();
        conn.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");

        //mysql DB 접속
        conn = new MySQLDriver();
        conn.getConnection("jdbc:mysql://localhost:3306/test", "root", "12345");

        //mssql DB 접속
        conn = new MSSQLDriver();
        conn.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=mem", "sa", "12345");
    }
}
