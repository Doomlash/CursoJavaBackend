package Dia05.Challenges;

public class Empleado {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;
    private int antiguedad;
    private String telefono;
    private Empleado empleado;
    private float salario;

    public Empleado(String nombre, String apellidos, String direccion, String dni, String telefono, float salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Empleado: antiguedad=" + antiguedad + ", apellidos=" + apellidos + ", direccion=" + direccion + ", dni="
                + dni + ", empleado=" + empleado + ", nombre=" + nombre + ", salario=" + salario + ", telefono="
                + telefono;
    }

    public void cambiarSupervisor(Empleado empleado){
        this.empleado = empleado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public float getSalario() {
        return salario;
    }
    public void cambiarSalario(float aumento){
        salario+=aumento;
    }
}
