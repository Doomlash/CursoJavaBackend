package Dia09.Challenge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String db="jdbc:mysql://localhost:3306/mydb";
	    private static final String usuario ="root";
	    private static final String clave="root";
	    Connection c = null;

        public  Database(){
	        try {
	            this.c = DriverManager.getConnection(db, usuario, clave);
	    
	        } catch (Exception e) {
	            System.out.println("Error al conectar con la base de datos.\n"
	                    + e.getMessage().toString());
	        } 
	    }
		public Connection getConnection() {
			 return this.c; 
		}
        public void close() {
            if (this.c != null) {
               try {
                   this.c.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
           }
       }
}
