package Dia06.Challenge;

public class Profesor extends Empleado{
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString()+" Profesor [departamento=" + departamento + "]";
    }

    
}
