package Dia05.Challenges;

import java.util.LinkedList;
import java.util.List;

public class Vendedor extends Empleado{
    private String vehiculo;
    private String movil;
    private String areaVenta;
    private List<Cliente> clientes;
    private double comision;

    public Vendedor(String nombre, String apellidos, String direccion, String dni, String telefono, float salario, String movil, String areaVenta, double comision, String vehiculo) {
        super(nombre, apellidos, direccion, dni, telefono, salario);
        this.movil = movil;
        this.areaVenta = areaVenta;
        clientes = new LinkedList<Cliente>();
        this.comision = comision;
        this.vehiculo = vehiculo;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }
    
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString() + ", areaVenta=" + areaVenta + ", clientes=" + clientes.toString() + ", comision=" + comision + ", movil="
                + movil + ", vehiculo=" + vehiculo;
    }
    
    public void ingresarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente){
        clientes.remove(cliente);
    }

}
