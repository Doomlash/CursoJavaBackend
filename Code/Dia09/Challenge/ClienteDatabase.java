package Dia09.Challenge;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDatabase {
    private DatabaseConnection dbc;
    public ClienteDatabase(){
        dbc = DatabaseConnection.getInstance();
    }

    public void insertCliente(Cliente cliente){
        Connection c = dbc.getConnection();
        try {
            PreparedStatement st = c.prepareStatement("INSERT INTO Cliente(dni,nombre,apellido,direccion,fechaNacimiento) values(?,?,?,?,?);");
            st.setInt(1, cliente.getDni());
            st.setString(2, cliente.getNombre());
            st.setString(3, cliente.getApellido());
            st.setString(4, cliente.getDireccion());
            st.setString(5, cliente.getFechaNacimiento());
            st.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
