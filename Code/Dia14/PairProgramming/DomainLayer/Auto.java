package springboot.main.DomainLayer;

public class Auto {
    private String marca;
    private String modelo;
    private int nroPuertas;
    private int nroRuedas;
    private int nroAsientos;


    public Auto(int serialNumber, String marca, String modelo, int nroPuertas, int nroRuedas, int nroAsientos) {
        this.marca = marca;
        this.modelo = modelo;
        this.nroPuertas = nroPuertas;
        this.nroRuedas = nroRuedas;
        this.nroAsientos = nroAsientos;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getNroPuertas() {
        return nroPuertas;
    }
    public int getNroRuedas() {
        return nroRuedas;
    }
    public int getNroAsientos() {
        return nroAsientos;
    }
    
}
