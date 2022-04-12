package Dia05.Pair_Programming;

public class Mesa {

    private int capacidad;
    private boolean isOcupada;
    private Mozo mozo;
    private int nroMesa;

    public Mesa(int capacidad, boolean isOcupada, Mozo mozo, int nroMesa) {
        this.capacidad = capacidad;
        this.isOcupada = isOcupada;
        this.mozo = mozo;
        this.nroMesa = nroMesa;
    }

    public void setMozo(Mozo mozo) {
        this.mozo = mozo;
    }

    public Mozo getMozo() {
        return this.mozo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isIsOcupada() {
        return isOcupada;
    }

    public void setIsOcupada(boolean isOcupada) {
        this.isOcupada = isOcupada;
    }

    public int getNroMesa() {
        return nroMesa;
    }

    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }

}
