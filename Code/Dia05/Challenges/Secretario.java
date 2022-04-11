package Dia05.Challenges;

public class Secretario extends Empleado{
    private final double AUMENTO_ANUAL = 0.05;
    private String despacho;
    private String fax; 
    public Secretario(String nombre, String apellidos, String direccion, String dni, String telefono, float salario, String despacho, String fax) {
        super(nombre, apellidos, direccion, dni, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }
    @Override
    public String toString() {
        return super.toString()+ "despacho=" + despacho + ", fax=" + fax;
    }
    public String getDespacho() {
        return despacho;
    }
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }
    public String getFax() {
        return fax;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }   
    
}
