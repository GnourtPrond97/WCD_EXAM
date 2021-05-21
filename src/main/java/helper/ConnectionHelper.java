package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionHelper {

    private static final String DATABASE_URL_FORMAT = "jdbc:mysql://%s:%d/%s?useUnicode=true&contentEncoding=UTF-8";
    private static final String DATABASE_SERVER = "localhost";
    private static final int DATABASE_PORT = 3306;
    private static final String DATABASE_NAME = "restaurants";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PWD = "";
    private static Connection cnn;

    public static Connection getConnection() {
        try {
            if (cnn == null || cnn.isClosed()) {
                cnn = DriverManager.getConnection(
                        String.format(DATABASE_URL_FORMAT, DATABASE_SERVER, DATABASE_PORT, DATABASE_NAME),
                        DATABASE_USER,
                        DATABASE_PWD);
                System.out.println("Connect success!");
            }
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
        }
        return cnn;
    }
}
