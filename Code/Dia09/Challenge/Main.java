package Dia09.Challenge;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        ClienteDatabase cd = new ClienteDatabase();
        Cliente c = new Cliente();
        c.setDni(1);
        c.setNombre("asd");
        c.setApellido("asd");
        c.setDireccion("asd");
        c.setFechaNacimiento("1996-12-28");
        cd.insertCliente(c);
		
		
    }
}
