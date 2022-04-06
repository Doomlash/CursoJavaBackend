package Dia03.Lectura;

public class Rectangulo extends Figura{
    int ladoA, ladoB;
    public Rectangulo(int ladoA, int ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        super.setName("Rectangulo");
    }
    
    @Override
    public int getPerimetro() {
        return ladoA*2+ladoB*2;
    }
}
