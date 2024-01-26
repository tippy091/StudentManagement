package Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class Data {
    public static  Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students?useSSL=false", "root", "12345");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
