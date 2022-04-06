package Dia03.Lectura;

public class Cuadrado extends Figura{
    int lado;
    public Cuadrado(int lado){
        this.lado = lado;
        super.setName("Cuadrado");
    }
    
    @Override
    public double getPerimetro() {
        return lado*4;
    }
}
