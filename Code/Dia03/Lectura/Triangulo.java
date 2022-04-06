package Dia03.Lectura;

public class Triangulo extends Figura {
    int ladoA, ladoB, ladoC;
    public Triangulo(int ladoA, int ladoB, int ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        super.setName("Triangulo");
    }
    
    @Override
    public int getPerimetro() {
        return ladoA+ladoB+ladoC;
    }
    
}
