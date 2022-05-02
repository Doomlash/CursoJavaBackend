package dia21.pp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Alfajor {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    @Override
    public String toString() {
        return "Alfajor [descripcion=" + descripcion + ", id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
    }
}
