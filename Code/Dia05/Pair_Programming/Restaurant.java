package Dia05.Pair_Programming;

import java.util.List;

public class Restaurant {

    private String nombre;
    private List<Empleado> empleados;
    private TableManager manager;

    public Restaurant(String nombre, List<Empleado> empleados, List<Mesa> mesas, TableManager manager) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.manager = manager;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void listarEmpleados() {
        for (Empleado empleado : this.empleados) {
            System.out.println(empleado);
        }
    }

    public TableManager getManager() {
        return manager;
    }

    public void setManager(TableManager manager) {
        this.manager = manager;
    }

}
