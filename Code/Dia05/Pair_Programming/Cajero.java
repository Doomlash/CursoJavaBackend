package Dia05.Pair_Programming;

public class Cajero extends Empleado{
    
    public Cajero(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String cobrar(double monto, double costo){
        return "Se le ha cobrado "+String.valueOf(costo)+". Su vuelto es de "+String.valueOf(monto-costo);
    }
    
    @Override
    public String info() {
        return "Nombre = "+nombre+" "+apellido+". Puesto = Cajero";
    }
}
