package Dia08.Challenge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.xml.crypto.Data;

public class Database {
    Connection c;
    public Database(){
        try {
            this.c = DriverManager.getConnection("jdbc:mysql://localhost:", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
