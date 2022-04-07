package Dia04.Challenge;

public class VehiculoParticular extends Vehiculo{
    private int puertas;


    public VehiculoParticular(String matricula, int puertas) {
        super(matricula);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }
    
}
