package Dia06.Challenge;

public class Persona {
    private String nombre;
    private String apellido;
    private String id;
    private String estadoCivil;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    @Override
    public String toString() {
        return "Persona [apellido=" + apellido + ", estadoCivil=" + estadoCivil + ", id=" + id + ", nombre=" + nombre
                + "]";
    }

    
}
