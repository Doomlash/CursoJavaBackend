package Dia03.Lectura;

public class Circulo extends Figura{
    int radio;
    public Circulo(int radio){
        this.radio = radio;
        super.setName("Circulo");
    }
    
    @Override
    public double getPerimetro() {
        return Math.PI*radio;
    }
}
