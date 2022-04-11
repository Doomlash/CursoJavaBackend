package Dia06.Challenge;

public class Empleado extends Persona{
    private String incorporacion;
    private String despacho;
    public String getIncorporacion() {
        return incorporacion;
    }
    public void setIncorporacion(String incorporacion) {
        this.incorporacion = incorporacion;
    }
    public String getDespacho() {
        return despacho;
    }
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }
    @Override
    public String toString() {
        return super.toString()+" Empleado [despacho=" + despacho + ", incorporacion=" + incorporacion + "]";
    }

    
}
