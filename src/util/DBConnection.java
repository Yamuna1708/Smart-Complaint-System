package util;



import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() throws Exception {

        String url = "jdbc:mysql://localhost:3306/complaint_db";
        String user = "root";
        String password = ""; // XAMPP default is empty

        return DriverManager.getConnection(url, user, password);
    }
}
