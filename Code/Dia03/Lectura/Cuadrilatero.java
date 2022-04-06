package Dia03.Lectura;

public class Cuadrilatero extends Figura{
    int ladoA, ladoB, ladoC, ladoD;
    public Cuadrilatero(int ladoA, int ladoB, int ladoC, int ladoD){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
        super.setName("Cuadrilatero");
    }
    
    @Override
    public int getPerimetro() {
        return ladoA+ladoB+ladoC+ladoD;
    }
}
