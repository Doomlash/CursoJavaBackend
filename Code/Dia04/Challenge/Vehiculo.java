package Dia04.Challenge;

public class Vehiculo {
    private String matricula;
    private int speed;

    public Vehiculo(String matricula){
        this.matricula = matricula;
        this.speed = 0;
    }

    public void accelerate(int speed){
        this.speed+=speed;
        if(this.speed<0){
            this.speed=0;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Matricula = "+matricula+" - Velocidad = "+String.valueOf(speed);
    }
}
