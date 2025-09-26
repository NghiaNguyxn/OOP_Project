import java.sql.*;

public class Database_Connection {

    private static final String url = "jdbc:mysql://localhost:3306/cuahang";
    private static final String user = "root";
    private static final String password = "123456";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
