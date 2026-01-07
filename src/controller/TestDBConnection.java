package controller;


import util.DBConnection;
import java.sql.Connection;

public class TestDBConnection {

    public static void main(String[] args) {

        try {
            Connection con = DBConnection.getConnection();
            System.out.println("✅ Database connected successfully!");
            con.close();
        } catch (Exception e) {
            System.out.println("❌ Connection failed");
            e.printStackTrace();
        }
    }
}
