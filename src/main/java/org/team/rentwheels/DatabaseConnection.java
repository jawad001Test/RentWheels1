package org.team.rentwheels;
import java.sql.*;

public final class DatabaseConnection {
    private static Connection connection;
    private static final String dbName="";
    private static final String dbUserName="";
    private static final String dbPassword="";
    private static final String url="jdbc:mysql://localhost/" +dbName;

    public DatabaseConnection() {
    }

    public static void connect() throws SQLException {
        connection = DriverManager.getConnection(url,dbUserName,dbPassword);
    }

    public static ResultSet executeQuery(String query) throws SQLException {
        if(connection == null) connect();
        Statement statement = connection.createStatement();
        return statement.executeQuery(query);
    }

    public static Connection getConnection() throws SQLException {
        if(connection == null) connect();
        return connection;
    }
    public void close() throws SQLException{
        connection.close();
    }

}
