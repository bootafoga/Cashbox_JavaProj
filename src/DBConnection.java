import java.sql.*;

public class DBConnection {
    private static final String NAME = "root";
    private static final String PASS = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    private Connection connection;

    public DBConnection() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            connection = DriverManager.getConnection(URL, NAME, PASS);
            Statement statement = connection.createStatement();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

}
