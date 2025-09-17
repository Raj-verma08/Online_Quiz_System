package dao;
import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/quizdb?useSSL=false&serverTimezone=UTC";
    private static final String USER = "quizuser";     // change if needed
    private static final String PASSWORD = "quizpass"; // change if needed

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // ensures driver available
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}


