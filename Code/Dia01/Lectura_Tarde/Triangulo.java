package Dia01.Lectura_Tarde;

public class Triangulo {
    private float ladoA, ladoB, ladoC;

    public Triangulo(float ladoA, float ladoB, float ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public String tipoDeTriangulo(){
        if (ladoA == ladoB) {
            if (ladoB == ladoC){
                return "Equilatero";
            }
            else{
                return "Isosceles";
            }
        } else {
            if (ladoB == ladoC){
                return "Isosceles";
            }
            else{
                return "Escaleno";
            }
        }
    }
}