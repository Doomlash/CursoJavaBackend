package Dia09.Challenge;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private Database db;
    private Connection c;
    private static DatabaseConnection  instance;

    private DatabaseConnection(){
        db = new Database();
        c = db.getConnection();
    }
    public static DatabaseConnection getInstance(){
        if (instance==null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public ResultSet query(String statement){
        ResultSet rs = null;
        try {
            rs = c.createStatement().executeQuery(statement);
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }
    public Connection getConnection() {
        return c;
    }
}
